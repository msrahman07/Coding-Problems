class Node {
    public int value;
    public int key;
    public Node next;
    public Node prev;
    
    public Node(int key, int value) {
        this.value = value;
        this.next = null;
        this.prev = null;
    }
}
class LRUCache {
    private Node head = null;
    private Node tail = null;

    private void addFirst(Node node) {
        node.next = head;
        if(head != null) head.prev = node;
        head = node;
        if(tail == null) tail = node;
    }

    private Node removeFirst() {
        Node temp = head;
        head = head.next;
        if(head != null) {
            head.prev = null;
        } else tail = null;
        return temp;
    }

    private Node removeLast() {
        Node temp = tail;
        tail = tail.prev;
        if(tail != null) {
            tail.next = null;
        } else head = null;
        return temp;
    }

    private Node removeInPosition(Node node) {
        if(node.prev == null){
            return removeFirst();
        }
        if(node.next == null) {
            return removeLast();
        }
        Node temp = node;
        node.prev.next = node.next;
        node.next.prev = node.prev;
        return temp;
    }

    Map<Integer, Node> cache = new HashMap();
    int capacity;
    public LRUCache(int capacity) {
        this.capacity = capacity;
    }
    
    public int get(int key) {
        if(cache.containsKey(key)) {
            removeInPosition(cache.get(key));
            addFirst(cache.get(key));
            return cache.get(key).value;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(cache.size() < capacity) {
            cache.put(key, new Node(key, value));
        } else {
            Node lru = removeLast();
            cache.remove(lru.key);
            cache.put(key, new Node(key, value));
        }
        addFirst(cache.get(key));
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */

package HashTable;

public class HashEntry<K, V> {
    private K key;
    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    private V value;
    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    private HashEntry<K,V> next;
    
    public HashEntry<K, V> getNext() {
        return next;
    }

    public void setNext(HashEntry<K, V> next) {
        this.next = next;
    }

    public HashEntry(K key, V value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}

package customCollection;

public class CustomQueue<T> {
	private Node<T> head;
    private Node<T> tail;
    private int size = 0;

    public Node<T> getTail() {
        return tail;
    }
    public Node<T> getHead() {
        return head;
    }

    public int length() {
        return size;
    }
    
    public void addFirst(T data) {
        Node<T> newNode = new Node<T>(data);
        newNode.setNext(head);
        newNode.setPrev(null);

        if(head != null) head.setPrev(newNode);
        head = newNode;
        if(tail == null) tail = newNode;
        size++;
    }

    public void addLast(T data) {
        Node<T> newNode = new Node<T>(data);
        newNode.setNext(null);
        newNode.setPrev(tail);

        if(tail != null) {
            tail.setNext(newNode);
        }
        tail = newNode;

        if(head == null) head = newNode;
        size++;
    }

    public T removeFirst() {
        if(size == 0) {
            System.out.println("No elements to remove");
            return null;
        }
        Node<T> temp = head;
        head = head.getNext();
        if(head != null) {
        	head.setPrev(null);	
        } else tail = null;
        size--;
        return temp.getData();
    }

    public T removeLast() {
        if (size == 0) {
        	System.out.println("No elements to remove");
            return null;
        }
        Node<T> temp = tail;
        tail = tail.getPrev();
        if(tail != null) {
        	tail.setNext(null);	
        } else head = null;
        size--;
        return temp.getData();
    }

    public T removeCurrentElement(Node<T> current) {
        if(current.getPrev() == null) return removeFirst();
        if(current.getNext() == null) return removeLast();

        Node<T> temp = current;

        current.getPrev().setNext(current.getNext());
        current.getNext().setPrev(current.getPrev());
        current = null;
        size--;
        return temp.getData();
    }

    public void printList() {
        Node<T> temp = head;

        while(temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        }
    }
}

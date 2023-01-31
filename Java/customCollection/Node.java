package customCollection;

public class Node<T> {
	private T data;
    private Node<T> next;
    private Node<T> prev;

    Node(T d) {
        data = d;
        next = null;
        prev = null;
    }

    public T getData() {
        return data;
    }
    public Node<T> getNext() {
        return next;
    }
    public void setNext(Node<T> n) {
        next = n;
    }
    public Node<T> getPrev() {
        return prev;
    }
    public void setPrev(Node<T> n) {
        prev = n;
    }
}

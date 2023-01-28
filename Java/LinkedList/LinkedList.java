public class LinkedList {
    Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        Node tail = head;
        while(tail.next != null) {
            tail = tail.next;
        }
        tail.next = newNode;
    }

    public void printList() {
        Node temp = head;

        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void delete(int val) {
        Node temp = head, prev = null;

        if(head != null && head.data == val) {
            head = head.next;
            return;
        }
        while(temp != null) {
            if(temp.data == val) {
                prev.next = temp.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
    }
}
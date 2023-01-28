public class Test {
    public static void main(String[] args) { 
        LinkedList list = new LinkedList();

        list.insert(5);
        list.insert(10);
        list.insert(2);
        list.insert(1);

        list.printList();
        System.out.println();
        list.delete(10);
        list.printList();

    }
}
package customCollection;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomQueue<Integer> list = new CustomQueue<Integer>();

        list.addFirst(1);
        list.addFirst(10);
        list.addFirst(2);
        list.addLast(100);
        list.addFirst(1);

        list.addFirst(1);
        list.addFirst(10);
        list.addFirst(2);
        list.addLast(100);
        list.addFirst(1);
        list.printList();

        Node<Integer> temp = list.getHead();

        System.out.println("");
        
        while(temp != null) {
//            System.out.println(temp.getData());
//            if(temp.getData() == 1 || temp.getData() == 10) {
                list.removeCurrentElement(temp);
//            }
            temp = temp.getNext();
        }
//        list.removeFirst();
//        list.removeLast();
        System.out.println("List now:");
        
        list.printList();
	}

}

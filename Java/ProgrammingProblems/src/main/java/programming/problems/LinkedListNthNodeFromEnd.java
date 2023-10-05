package programming.problems;

/* Delete nth node from the end of LinkedList */

public class LinkedListNthNodeFromEnd {
    public ListNode nthNodeFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        int listLength = 0;
        ListNode curr = head;

        while(curr != null) {
            curr = curr.next;
            listLength++;
        }
        if(n > listLength) {
            return null;
        }
        curr = dummy;

        for(int i=0; i<listLength-n; i++) {
            curr = curr.next;
        }
        if(curr.next != null) {
            curr.next = curr.next.next;
        }
        return dummy.next;

    }
}

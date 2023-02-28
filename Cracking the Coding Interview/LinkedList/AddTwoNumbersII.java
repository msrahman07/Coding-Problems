import java.util.Stack;

public class AddTwoNumbersII {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<ListNode> l1Stack = new Stack<ListNode>();
        Stack<ListNode> l2Stack = new Stack<ListNode>();

        while(l1 != null || l2 != null) {
            if(l1 != null) {
                l1Stack.push(l1);
                l1 = l1.next;
            }
            if(l2 != null) {
                l2Stack.push(l2);
                l2 = l2.next;
            }
        }
        ListNode sumList = null;
        int carry = 0;

        while(!l1Stack.isEmpty() || !l2Stack.isEmpty() || carry > 0) {
            int value = carry;
            if(!l1Stack.isEmpty()) value += l1Stack.pop().val;
            
            if(!l2Stack.isEmpty()) value += l2Stack.pop().val;

            if(value > 9) {
                value -= 10;
                carry = 1;
            } else {
                carry = 0;
            }
            ListNode temp = new ListNode(value);
            temp.next = sumList;
            sumList = temp;
        }
        return sumList;
    }
}

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sumList = new ListNode();
        ListNode sumListItr = sumList;
        int carry = 0;
        int sum = 0;
        int firstValue = 0;
        int secondValue = 0;

        while(l1 != null || l2 != null || carry > 0) {
            
            firstValue = (l1 != null) ? l1.val : 0;
            secondValue = (l2 != null) ? l2.val : 0;
            sum = firstValue + secondValue + carry;

            if(sum > 9) {
                sumListItr.next = new ListNode(sum-10);
                carry = 1;
            } else {
                sumListItr.next = new ListNode(sum);
                carry = 0;
            }
            sumListItr = sumListItr.next;
            if(l1 != null) {
                l1 = l1.next;
            }
            if(l2 != null) {
                l2 = l2.next;
            }
            
        }
        
        return sumList.next;
    }
}

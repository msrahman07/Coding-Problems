/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0);
        ListNode tempAns = ans;
        int carryOn = 0;
        int val1 = 0;
        int val2 = 0;
        int answer = 0;
        while(l1 != null || l2 != null){
            if(l1 != null){
                val1 = l1.val;
            }else{
                val1 = 0;
            }
            if(l2 != null){
                val2 = l2.val;
            }else{
                val2 = 0;
            }
            // System.out.println(val1+", "+val2);
            answer = val1+val2+carryOn;
            if(answer > 9){
                answer -= 10;
                carryOn = 1;
            }else{
                carryOn = 0;
            }
            tempAns.next = new ListNode(answer);
            tempAns = tempAns.next;
            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }
        }
        if(carryOn != 0){
            tempAns.next = new ListNode(carryOn);
        }
        return ans.next;
    }
}

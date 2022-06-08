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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null && n==1) {
        head = null;
        return head;
        }
        ListNode first = head;

        for(int i=0;i<n;i++){
            if(first==null)
                break;
            first=first.next;
        }
        if(first==null)
            return head.next;
        ListNode second = head;
        ListNode temp = head;
        while(first!=null){
            temp = second;
            second=second.next;
            first=first.next;
        }
        temp.next = second.next;
        return head;
    }
}

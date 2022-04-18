public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 
class DeleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        // if(head==null || head.next==null){
        //     return head;
        // }
        // if(head.val == head.next.val){
        //     head.next = head.next.next;
        //     deleteDuplicates(head);
        // }
        // else{
        //     deleteDuplicates(head.next);
        // }
        // return head;
        ListNode curr = head;
        if(head == null || head.next == null){
            return head;
        }
        
        while(curr != null){
            while(curr.next !=null && curr.val == curr.next.val){
                curr.next = curr.next.next;
            }
            curr = curr.next;
        }
        
        return head;
    }
}

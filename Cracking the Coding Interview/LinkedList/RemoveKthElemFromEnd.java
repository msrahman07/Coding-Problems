public class RemoveKthElemFromEnd {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return head;

        ListNode left = new ListNode(0, head);
        ListNode dummy = left;
        ListNode right = head;

        for(int i = 0; i < n && right != null; i++) {
            right = right.next;
        }
        while(right != null) {
            left = left.next;
            right = right.next;
        }
        deleteNextNode(left);
        return dummy.next;
    }
    private void deleteNextNode(ListNode node) {
        node.next = node.next.next;
    }
}
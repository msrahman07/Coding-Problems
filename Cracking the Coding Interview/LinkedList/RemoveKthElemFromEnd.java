public class RemoveKthElemFromEnd {
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
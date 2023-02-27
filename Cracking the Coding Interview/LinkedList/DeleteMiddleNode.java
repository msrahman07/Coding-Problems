public class DeleteMiddleNode {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode deleteMiddle(ListNode head) {
        // if(head == null || head.next == null) return null;
        // ListNode prevOfHead = new ListNode(0, head);
        // ListNode current = head;
        // int length = 0;

        // while(current != null) {
        //     length++;
        //     current = current.next;
        // }
        // current = head;
        // int mid = (int)Math.floor(length/2);

        // for(int i = 0; i < mid-1; i++) {
        //     current = current.next;
        // }
        // if(current.next != null && current.next.next != null) {
        //     current.next = current.next.next;
        // } else {
        //     current.next = null;
        // }
        // return prevOfHead.next;
        if(head == null || head.next == null) return null;

        ListNode slow = new ListNode(0, head);
        ListNode fast = new ListNode(0, head);

        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
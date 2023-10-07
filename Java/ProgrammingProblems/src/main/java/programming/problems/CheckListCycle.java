package programming.problems;
/*
Given head, the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.

Return true if there is a cycle in the linked list. Otherwise, return false.
*/
public class CheckListCycle {
    // public boolean hasCycle(ListNode head) {
    //     HashSet<ListNode> nodeSet = new HashSet();
    //     ListNode curr = head;
    //     while(curr != null) {
    //         if(nodeSet.contains(curr)) return true;
    //         nodeSet.add(curr);
    //         curr = curr.next;
    //     }
    //     return false;
    // }
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;
        ListNode left = head;
        ListNode right = head.next;

        while(right != null && right.next != null) {
            if(left == right) {
                return true;
            }
            left = left.next;
            right = right.next.next;
        }
        return false;
    }
}

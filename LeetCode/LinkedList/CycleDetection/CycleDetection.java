class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
 }
 
public class CycleDetection {
    public boolean hasCycle(ListNode head) {
//         ListNode curr = head;
//         ListNode ptr = curr;
//         if(curr == null || curr.next==null){
//             return false;
//         }
//         while(ptr != null && ptr.next != null){
//             curr = curr.next;
//             ptr = ptr.next.next;

//             if(curr == ptr){
//                 return true;
//             }
//         }
//         return false;
        Set<ListNode> listSet = new HashSet<>();
        ListNode curr = head;
        while(curr != null){
            if(listSet.contains(curr)){
                return true;
            }
            listSet.add(curr);
            curr = curr.next;
        }
        return false;
    }
}

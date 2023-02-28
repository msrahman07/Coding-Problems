public class IntersectionOfTwoLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // O(A+B) time and O(1) space
        int lengthA = 0;
        int lengthB = 0;
        ListNode longerList = headA;
        ListNode shorterList = headB;

        while(longerList != null || shorterList != null) {
            if(longerList != null) {
                lengthA++; 
                longerList = longerList.next;
            }
            if(shorterList != null) {
                lengthB++; 
                shorterList = shorterList.next;
            }
        }
        
        if(lengthA > lengthB) {
            longerList = headA;
            shorterList = headB;
        } else {
            longerList = headB;
            shorterList = headA;
        }

        for(int i = 0; i < Math.abs(lengthA-lengthB); i++) {
            longerList = longerList.next;
        }
        while(shorterList != null && longerList != null) {
            if(longerList == shorterList) return shorterList;
            longerList = longerList.next;
            shorterList = shorterList.next;
        }
        return null;
        /*
        // O(A+B) time and O(A) space
        Set<ListNode> hashSet = new HashSet();

        while(headA != null) {
            hashSet.add(headA);
            headA = headA.next;
        }
        while(headB != null) {
            if(hashSet.contains(headB)) {
                return headB;
            }
            headB = headB.next;
        }
        return null;
        */
    }
}

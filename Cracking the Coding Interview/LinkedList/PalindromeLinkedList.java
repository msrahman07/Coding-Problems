public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        // O(N) time and O(1) space
        
        int length = 0;
        ListNode currentPointer = head;
        
        // find length of the list
        while(currentPointer != null) {
            length ++;
            currentPointer = currentPointer.next;
        }
        // find the midpoint
        int midPoint = length/2;

        ListNode secondHalf = head;
        ListNode firstHalf = null;
        
        // reverse the first half of the list 
        for(int i=0; i < midPoint; i++) {
            ListNode temp = secondHalf.next;
            secondHalf.next = firstHalf;
            firstHalf = secondHalf;
            secondHalf = temp;
        }
        // if odd length then remove middle node
        if(length % 2 != 0) {
            secondHalf = secondHalf.next;
        }
        
        // compare first and second half
        while(secondHalf != null) {
            if(secondHalf.val != firstHalf.val) {
                return false;
            }
            secondHalf = secondHalf.next;
            firstHalf = firstHalf.next;
        }

        return true;

        // O(N) time and O(N) space
        // Stack<ListNode> listStack = new Stack();
        // ListNode currPointer = head;

        // while(currPointer != null) {
        //     listStack.push(currPointer);
        //     currPointer = currPointer.next;
        // }
        // currPointer = head;

        // while(currPointer != null) {
        //     if(currPointer.val != listStack.pop().val) {
        //         return false;
        //     }
        //     currPointer = currPointer.next;
        // }
        // return true;
    }
}

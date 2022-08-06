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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // ListNode f = list1;
        // ListNode s = list2;
        ListNode ans_head = new ListNode();
        ListNode tail = ans_head;
        while(list1!=null && list2!=null){ //this means heads of both these linkedlists shouldnot be null, i.e. linkedlist should exist
            if(list1.val<list2.val){
                tail.next = list1; //initially tail of answer was null, hence the next one to it became the smaller head of thw two linkedlists
                list1 = list1.next; //since the smaller head is used up, we move hed to next index
                tail=tail.next; //and tail of anwer is also moved ahead 
            } else{
                tail.next = list2;
                list2 = list2.next;
                tail=tail.next;
            }        
        } 
        while(list1!=null){ //now if we've iterated through all values of list2 and it is null but list1 is not null, we can take all of list1 one by one (as it is sorted)
            tail.next = list1;
            list1=list1.next;
            tail=tail.next;
        }
        while(list2!=null){
            tail.next=list2;
            list2=list2.next;
            tail=tail.next;
        }
        return ans_head.next;        
    }
}

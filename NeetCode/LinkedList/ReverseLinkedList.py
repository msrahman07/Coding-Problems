"""
LeetCode: 206. Reverse Linked List
NeetCode: 35/150

Given the head of a singly linked list, reverse the list, and return the reversed list.
"""

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        return self.reverse(None, head)
#         if(head == None or head.next == None):
#             return head
        
#         reverse = self.reverseList(head.next)
#         head.next.next = head
#         head.next = None
#         return reverse
#         prev, curr = None, head
        
#         while(curr != None):
#             temp = curr.next
#             curr.next = prev
#             prev = curr
#             curr = temp
            
#         return prev
    def reverse(self, prev, head):
        if(head == None):
            return prev
        temp = head.next
        head.next = prev
        prev = head
        head = temp
        return self.reverse(prev, head)


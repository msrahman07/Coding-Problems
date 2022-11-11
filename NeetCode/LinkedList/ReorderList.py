"""
LeetCode: 143. Reorder List
You are given the head of a singly linked-list. The list can be represented as:

L0 → L1 → … → Ln - 1 → Ln
Reorder the list to be on the following form:

L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
You may not modify the values in the list's nodes. Only nodes themselves may be changed.
"""

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reorderList(self, head: Optional[ListNode]) -> None:
        """
        Do not return anything, modify head in-place instead.
        """
        slow, fast = head, head.next
        while(fast and fast.next):
            slow = slow.next
            fast = fast.next.next
        
        second_half = slow.next
        slow.next = None
        prev = None
        
        while(second_half):
            temp = second_half.next
            second_half.next = prev
            prev = second_half
            second_half = temp
        
        first_half, second_half = head, prev
        
        while(second_half):
            temp1 = first_half.next
            temp2 = second_half.next
            first_half.next = second_half
            second_half.next = temp1
            second_half = temp2
            first_half = temp1
            

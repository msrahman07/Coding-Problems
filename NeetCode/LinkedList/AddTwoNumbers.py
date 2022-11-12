"""
LeetCode: 2. Add Two Numbers
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.
"""

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        sum_list = ListNode(0)
        curr = sum_list
        remainder = 0
        
        while(l1 or l2):
            val1 = 0
            val2 = 0
            
            if(l1):
                val1 = l1.val
                l1 = l1.next
            if(l2):
                val2 = l2.val
                l2 = l2.next
            
            sum_val = val1 + val2 + curr.val
            
            remainder = sum_val // 10
            sum_val = sum_val % 10

            curr.val = sum_val
            if(l1 or l2 or remainder == 1):
                curr.next = ListNode(remainder)
                curr = curr.next
            else:
                curr.next = None
                
        return sum_list
            

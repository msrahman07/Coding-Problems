# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseBetween(self, head: Optional[ListNode], left: int, right: int) -> Optional[ListNode]:
        start = head
        currentNode = head
        position = 1
        while(position < left):
            start = currentNode
            currentNode = currentNode.next
            position += 1
        
        newList = None
        nxt = None
        tail = currentNode
        while(position <= right):
            nxt = currentNode.next
            currentNode.next = newList
            newList = currentNode
            currentNode = nxt
            position += 1
            
        start.next = newList
        tail.next = currentNode
        
        if(left>1):
            return head
        else:
            return newList

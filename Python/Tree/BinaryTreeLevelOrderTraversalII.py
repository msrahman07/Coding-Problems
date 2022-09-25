"""
LeetCode: 107. Binary Tree Level Order Traversal II

Given the root of a binary tree, return the bottom-up level order traversal of its nodes' values. (i.e., from left to right, level by level from leaf to root).
"""

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def levelOrderBottom(self, root: Optional[TreeNode]) -> List[List[int]]:
        if(root is None):
            return []
        
        queue = deque()
        queue.append(root)
        output = deque()
        output.appendleft([root.val])
        
        while(queue):
            level = []
            
            for _ in range(len(queue)):
                node = queue.popleft()
                if(node.left):
                    queue.append(node.left)
                    level.append(node.left.val)
                if(node.right):
                    queue.append(node.right)
                    level.append(node.right.val)
                    
            if(level != []):
                output.appendleft(level)
        return output

"""
LeetCode: 110. Balanced Binary Tree

Given a binary tree, determine if it is height-balanced.
"""

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isBalanced(self, root: Optional[TreeNode]) -> bool:
        def getHeight(root):
            if(not root):
                return [True, 0]
            
            left = getHeight(root.left)
            right = getHeight(root.right)
            
            balanced = left[0] and right[0] and abs(right[1]-left[1]) <= 1
            return [balanced, 1+max(left[1], right[1])]
        return getHeight(root)[0]

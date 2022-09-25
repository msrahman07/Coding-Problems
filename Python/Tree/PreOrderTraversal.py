"""
LeetCode: 144. Binary Tree Preorder Traversal

Given the root of a binary tree, return the preorder traversal of its nodes' values.

"""

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    # Recursive approach
    """
    def preorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        output = []
        self.recursivePreOrder(output, root)
        return output
        
    def recursivePreOrder(self, output, root):
        if(not root):
            return
        output.append(root.val)
        self.recursivePreOrder(output, root.left)
        self.recursivePreOrder(output, root.right)
    """
    def preorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        stack = []
        if(root):
            stack.append(root)
        output = []
        while(stack):
            node = stack.pop()
            output.append(node.val)
            if(node.right):
                stack.append(node.right)
            if(node.left):
                stack.append(node.left)
        return output
    

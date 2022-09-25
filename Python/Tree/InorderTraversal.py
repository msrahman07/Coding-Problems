"""
LeetCode: 94. Binary Tree Inorder Traversal

Given the root of a binary tree, return the inorder traversal of its nodes' values.

"""

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    # Recursive
    """
    def inorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        output = []
        self.recursiveInorder(output, root)
        return output
    
    def recursiveInorder(self, output, root):
        if(not root):
            return
        self.recursiveInorder(output, root.left)
        output.append(root.val)
        self.recursiveInorder(output, root.right)
    """
    def inorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        stack = []
        curr = root
        output = []
        while(curr or stack):
            while(curr):
                stack.append(curr)
                curr = curr.left
            curr = stack.pop()
            output.append(curr.val)
            curr = curr.right
                
        return output

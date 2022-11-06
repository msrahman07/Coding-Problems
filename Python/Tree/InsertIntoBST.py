"""
LeetCode: 701. Insert into a Binary Search Tree

You are given the root node of a binary search tree (BST) and a value to insert into the tree. Return the root node of the BST after the insertion. It is guaranteed that the new value does not exist in the original BST.

Notice that there may exist multiple valid ways for the insertion, as long as the tree remains a BST after insertion. You can return any of them.

"""

# Definition for a binary tree node.
from typing import Optional


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right
class Solution:
    def insertIntoBST(self, root: Optional[TreeNode], val: int) -> Optional[TreeNode]:
        if(root == None):
            root = TreeNode(val)
            return root
        # Recursive Approach =========================
        # if(val <= root.val):
        #     if(root.left == None):
        #         root.left = TreeNode(val)
        #     else:
        #         self.insertIntoBST(root.left, val)
        # else:
        #     if(root.right == None):
        #         root.right = TreeNode(val)
        #     else:
        #         self.insertIntoBST(root.right, val)
        # ============================================
        
        # iterative Approach =========================
        node = root
        while(node):
            if(val <= node.val):
                if(not node.left):
                    node.left = TreeNode(val)
                    break
                else:
                    node = node.left
            else:
                if(not node.right):
                    node.right = TreeNode(val)
                    break
                else:
                    node = node.right
        
        return root

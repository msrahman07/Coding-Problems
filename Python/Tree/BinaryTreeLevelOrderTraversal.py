"""
LeetCode: 102. Binary Tree Level Order Traversal

"""

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        if(root == None):
            return []
        queue = deque()
        queue.append(root)
        output = [[root.val]]

        while(queue):
            level = []
            
            for _ in range(len(queue)):
                node = queue.popleft()
                if (node.left is not None):
                    level.append(node.left.val) 
                    queue.append(node.left)
                if (node.right is not None):
                    level.append(node.right.val)
                    queue.append(node.right)
            if(level != []):
                output.append(level)
            
        return output

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private boolean checkSum ( TreeNode root, int targetSum, int currSum ) {
        if ( root == null ) return false;
        currSum += root.val;
        if ( currSum == targetSum && root.left == null && root.right == null ) return true;
        if ( this.checkSum(root.left, targetSum, currSum) || this.checkSum(root.right, targetSum, currSum) ) return true;
        return false;
    }
    public boolean hasPathSum( TreeNode root, int targetSum ) {
        return this.checkSum(root, targetSum, 0);
    }
}

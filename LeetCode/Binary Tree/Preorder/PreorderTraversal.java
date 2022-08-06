public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
 }
 
class PreorderTraversal {
    List<Integer> preList = new ArrayList<>();
        
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root != null){
            preList.add(root.val);
            preorderTraversal(root.left);        
            preorderTraversal(root.right);        
        
        }
        return preList;
    }
}

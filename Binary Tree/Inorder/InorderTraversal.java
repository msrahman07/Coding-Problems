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
 
class InorderTraversal {
    List<Integer> inList = new ArrayList<>();
    
    public List<Integer> inorderTraversal(TreeNode root) {
        
        if(root != null){
            inorderTraversal(root.left);
            inList.add(root.val);
            inorderTraversal(root.right);
        }    
        return inList;
    }
}

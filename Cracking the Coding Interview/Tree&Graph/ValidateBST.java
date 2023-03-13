public class ValidateBST {
    Integer last_printed = null;
    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;

        if(!isValidBST(root.left)) {
            return false;
        }
        if(last_printed != null && last_printed >= root.val) {
            return false;
        }
        last_printed = root.val;
        
        if(!isValidBST(root.right)) {
            return false;
        }
        return true;
    }    
}

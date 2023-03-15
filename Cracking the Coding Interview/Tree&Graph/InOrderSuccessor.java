public class InOrderSuccessor {
    TreeNode inorderSucc(TreeNode node) {
        if(node == null) return null;

        if(node.right != null) {
            return leftMostChild(node.right); 
        } else {
            TreeNode currNode = node;
            TreeNode node_parent = currNode.parent;

            while(node_parent != null && node_parent.left != currNode) {
                currNode = node_parent;
                node_parent = node_parent.parent;
            }
            return node_parent;

        }
    }

    TreeNode leftMostChild(TreeNode n) {
        if(n == null) return null;
        
        while(n.left != null) {
            n = n.left;
        }
        return n;
    }
}
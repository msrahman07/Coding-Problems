public class FirstCommonAncestor {
    public TreeNode firstCommonAncestor(
        TreeNode root,
        TreeNode p,
        TreeNode q
    ) {
        if (p.val > root.val && q.val > root.val) return firstCommonAncestor(
            root.right,
            p,
            q
        );
        if (p.val < root.val && q.val < root.val) return firstCommonAncestor(
            root.left,
            p,
            q
        );
        return root;
    }
}

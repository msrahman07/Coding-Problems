import java.util.ArrayList;
import java.util.LinkedList;

/*
 * Given a binary tree, design an algorithm which creates a linked list of all the nodes
at each depth (e.g., if you have a tree with depth D, you'll have D linked list
 */
public class ListOfDepths {
    public ArrayList<LinkedList<TreeNode>> createLevelLinkedList(TreeNode root) {
        ArrayList<LinkedList<TreeNode>> lists = new ArrayList<LinkedList<TreeNode>>();
        createLevelLinkedList(root, lists, 0);
        return lists;
    }

    private void createLevelLinkedList(TreeNode root, ArrayList<LinkedList<TreeNode>> lists, int level) {
        if(root == null) return;

        LinkedList<TreeNode> list = null;

        if(lists.size() == level) {
            list = new LinkedList<TreeNode>();
            lists.add(list);
        } else {
            list = lists.get(level);
        }
        createLevelLinkedList(root.left, lists, level + 1);
        createLevelLinkedList(root.right, lists, level + 1);
    }
}

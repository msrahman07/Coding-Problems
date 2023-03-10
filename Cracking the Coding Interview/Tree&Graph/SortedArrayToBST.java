public class SortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length <= 1) {
            return new TreeNode(nums[0]);
        }
        return sortedArrayToBSTHelper(nums, 0, nums.length-1);
    }
    private TreeNode sortedArrayToBSTHelper(int[] nums, int left, int right) {
        if(right < left) {
            return null;
        }
        int mid = (left + right)/2;
        TreeNode root = new TreeNode(nums[mid]);
        
        root.left = sortedArrayToBSTHelper(nums, left, mid-1);
        root.right = sortedArrayToBSTHelper(nums, mid+1, right);

        return root;
    } 
}

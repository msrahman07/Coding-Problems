package programming.problems;

public class BinarySearch {
    public int search(int[] nums, int target) {
        return recursiveBS(nums, 0, nums.length-1, target);
    }
    private int recursiveBS(int[] nums, int start, int end, int target) {

        int mid = (end+start)/2;
        if(start > end) {
            return -1;
        }

        if(nums[mid] == target) {
            return mid;
        } else if(target < nums[mid]) {
            return recursiveBS(nums, start, mid-1, target);
        } else {
            return recursiveBS(nums, mid+1, end, target);
        }
    }
}

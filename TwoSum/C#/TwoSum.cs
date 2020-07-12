public class Solution {
    public int[] TwoSum(int[] nums, int target) {
        int len = nums.Length;
        for(int i = 0; i< len-1; i++){
            for(int j = i+1; j<len; j++){
                if(nums[i]+nums[j]==target){
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }
}

class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        int prev = nums[0];
        
        for(int i=1; i<nums.length; i++){
            if(nums[i] != prev){
                nums[count] = nums[i];
                count++;
                prev = nums[i];
            }
        }
        return count;
    }
}

class LongestIncreasingSeq {
    public int lengthOfLIS(int[] nums) {
        if(nums.length == 1){
            return 1;
        }
        int[] LIS = new int[nums.length];
        Arrays.fill(LIS, 1);
        int maxCount = 0;
        for(int i=1; i<nums.length; i++){
            for(int j=0; j<i; j++){
                if(nums[j] < nums[i]){
                    LIS[i] = Math.max(1+LIS[j], LIS[i]);
                }
            }
            maxCount = Math.max(maxCount, LIS[i]);
        }
        return maxCount;
    }
}

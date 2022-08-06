class LongestConsecNums {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        Map<Integer, Integer> map =  new HashMap<>();
        int max = 1;
        int localMax = 0;
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i]-1) && !map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]-1)+1);
                localMax = map.get(nums[i]);
                max = Math.max(max, localMax);
            }
            else{
                map.put(nums[i], map.getOrDefault(nums[i], 1));
            }
        }
        return max;
    }
}

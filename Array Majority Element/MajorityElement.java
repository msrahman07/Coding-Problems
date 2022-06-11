class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        
        for(int i=0; i<nums.length; i++){
            if(numsMap.containsKey(nums[i])){
                numsMap.put(nums[i], numsMap.get(nums[i])+1);
            }else{
                numsMap.put(nums[i], 1);
            }
        }
        
        int max = Collections.max(numsMap.values());
        for (Map.Entry<Integer, Integer> entry : numsMap.entrySet()) {
            if (Objects.equals(entry.getValue(), max)) {
              return entry.getKey();
            }
        }
        
        return 0;
    }
}


class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> arrSet = new HashSet<>();
        
        for(int i=0; i<nums.length; i++){
            if(arrSet.contains(nums[i])){
                arrSet.remove(nums[i]);
            }else{
                arrSet.add(nums[i]);            
            }
        }
        return arrSet.stream().findFirst().get();
    }
}

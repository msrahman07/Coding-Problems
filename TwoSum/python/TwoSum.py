class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        length = len(nums)
        ind = 0
        for i in nums:
            val = target-i
            if(val in nums[ind+1:]):
                return [ind, nums.index(val, ind+1)]
            ind += 1
                
        return []
        

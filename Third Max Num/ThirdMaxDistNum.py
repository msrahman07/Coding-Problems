class Solution:
    def thirdMax(self, nums: List[int]) -> int:
        nums.sort(reverse=True)
        maxi = nums[0]
        maxCount = 0
        for i in range(1, len(nums)):
            if(nums[i] != nums[i-1]):
                maxCount += 1
            if(maxCount == 2):
                return nums[i]
            
        return maxi

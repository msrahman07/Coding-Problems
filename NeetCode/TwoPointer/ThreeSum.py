"""
LeetCode: 15. 3Sum
NeetCode: 12/150

Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.
"""

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        result = []
        nums.sort()
        
        for i, n in enumerate(nums):
            if(i > 0 and n == nums[i-1]):
                continue
            
            left, right = i+1, len(nums)-1
            
            while(left < right):
                currSum = n + nums[left] + nums[right]
                
                if(currSum > 0):
                    right -= 1
                elif(currSum < 0):
                    left += 1
                else:
                    result.append([n, nums[left], nums[right]])
                    left += 1
                    while(nums[left] == nums[left-1] and left < right):
                        left += 1
        return result

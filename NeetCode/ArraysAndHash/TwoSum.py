"""
LeetCode: 1. Two Sum
NeetCode: 3/150
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
"""

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
#         for i in range(len(nums)):
#             if((target-nums[i]) in nums and nums.index(target-nums[i]) != i):
#                 return [i, nums.index(target-nums[i])]
            
#         return []
        target_dict = {}
        
        for i,n in enumerate(nums):
            if(n in target_dict):
                return [i, target_dict[n]]
            else:
                target_dict[target-n] = i
                
        return []

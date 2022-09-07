"""
LeetCode: 217. Contains Duplicate
NeetCode: Blind 1/150

Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
"""
class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        dup_dict = set()
        
        for n in nums:
            if(n in dup_dict):
                return True
            dup_dict.add(n)
        return False

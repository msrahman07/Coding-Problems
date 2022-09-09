"""
LeetCode: 128. Longest Consecutive Sequence
NeetCode: 9/150 
Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.
"""

class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        nums_set = set(nums)
        longest_streak = 0
        
        
        for n in nums_set:
            if(n-1 not in nums_set):
                current_num = n
                current_streak = 1
                
                while(current_num+1 in nums_set):
                    current_num += 1
                    current_streak += 1

                longest_streak = max(longest_streak, current_streak)
                
        return longest_streak

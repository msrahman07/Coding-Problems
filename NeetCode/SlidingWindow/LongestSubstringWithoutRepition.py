"""
LeetCode: 3. Longest Substring Without Repeating Characters
NeetCode: 16/150

Given a string s, find the length of the longest substring without repeating characters.

"""

class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        substring_set = set()
        max_length = 0
        left = 0
        
        for right in range(len(s)):
            while(s[right] in substring_set):
                substring_set.remove(s[left])
                left += 1
            substring_set.add(s[right])
            
            max_length = max(max_length, right-left+1)
        return max_length
        

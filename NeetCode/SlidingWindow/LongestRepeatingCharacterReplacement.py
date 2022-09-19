"""
LeetCode: 424. Longest Repeating Character Replacement
NeetCode: 17/150

You are given a string s and an integer k. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most k times.

Return the length of the longest substring containing the same letter you can get after performing the above operations.

"""

from collections import Counter

class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        left = 0
        current_len = 0
        max_len = 0
        counter = defaultdict(int)
        
        for right in range(len(s)):
            counter[s[right]] += 1
            if(right-left+1 - max(counter.values()) <= k):
                max_len = max(max_len, right-left+1)
            else:
                counter[s[left]] -= 1
                left += 1
                
        return max_len

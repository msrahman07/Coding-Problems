"""
LeetCode: 76. Minimum Window Substring
NeetCode: 19/150

Given two strings s and t of lengths m and n respectively, return the minimum window substring of s such that every character in t (including duplicates) is included in the window. If there is no such substring, return the empty string "".

The testcases will be generated such that the answer is unique.

A substring is a contiguous sequence of characters within the string.
"""

from collections import Counter
class Solution:
    def minWindow(self, s, t):
        if(len(t) == 0 or len(t) > len(s)):
            return ""
        
        count_t, window = Counter(t), {}
        
        result, result_length = [-1,-1], float("infinity")
        
        left, have, need = 0, 0, len(count_t)
        
        for right in range(len(s)):
            c = s[right]
            window[c] = 1 + window.get(c, 0)
            
            if c in count_t and window[c] == count_t[c]:
                have += 1
            
            while(have == need):
                window[s[left]] -= 1
                if(right-left+1 < result_length):
                    result, result_length = [left, right], right-left+1
                    
                if(s[left] in count_t and window[s[left]] < count_t[s[left]]):
                    have -= 1
                left += 1
                
        l, r = result

        return s[l: r+1] if result_length != float("infinity") else ""
        
        


"""
LeetCode: 567. Permutation in String
NeetCode: 18/150

Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.

In other words, return true if one of s1's permutations is the substring of s2.
"""

class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        if(len(s1) > len(s2)): return False
    
        s1_count, s2_count = [0]*26, [0]*26
        matches = 0
        
        for i in range(len(s1)):
            s1_count[ord(s1[i]) - ord('a')] += 1
            s2_count[ord(s2[i]) - ord('a')] += 1
            
        for i in range(26):
            matches += (1 if s1_count[i] == s2_count[i] else 0)
        
        left = 0
        
        for right in range(len(s1), len(s2)):
            if(matches == 26):
                return True
            
            index = ord(s2[right]) - ord('a')
            s2_count[index] += 1
            if(s1_count[index] == s2_count[index]):
                matches += 1
            elif(s1_count[index]+1 == s2_count[index]):
                matches -= 1
                
            index = ord(s2[left]) - ord('a')
            s2_count[index] -= 1
            if(s1_count[index] == s2_count[index]):
                matches += 1
            elif(s1_count[index]-1 == s2_count[index]):
                matches -= 1
            left += 1
            
        
        return matches == 26

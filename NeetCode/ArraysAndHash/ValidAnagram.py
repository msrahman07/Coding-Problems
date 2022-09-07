"""
LeetCode: 242. Valid Anagram
NeetCode: 2/150

Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

"""

class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
#         if(len(s) != len(t)):
#             return False
        
#         s_dict, t_dict = {}, {}
        
#         for i in range(len(s)):
#             s_dict[s[i]] = 1 + s_dict.get(s[i], 0)
#             t_dict[t[i]] = 1 + t_dict.get(t[i], 0)
            
        
#         return s_dict == t_dict
        s_dict = {}

        for ltr in s:
            if(ltr in s_dict):
                s_dict[ltr] += 1
            else:
                s_dict[ltr] = 1

        for ltr in t:
            if(ltr in s_dict):
                s_dict[ltr] -= 1
            else:
                return False

        for (k,v) in s_dict.items():
            if(v > 0 or v < 0):
                return False
        return True
#         alphabets = [0 for i in range(26)]
        
#         for ltr in s:
#             alphabets[ord(ltr) - ord('a')] += 1
            
#         for ltr in t:
#             alphabets[ord(ltr) - ord('a')] -= 1
        
#         for alph in alphabets:
#             if(alph < 0 or alph > 0):
#                 return False
        
#         return True

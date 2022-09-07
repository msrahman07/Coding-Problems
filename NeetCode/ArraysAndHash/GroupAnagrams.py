"""
LeetCode: 49. Group Anagrams
NeetCode: 4/150

Given an array of strings strs, group the anagrams together. You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
"""

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagram_dict = {}
        keyExists = False
        
        for s in strs:
            word = ''.join(sorted(s))
            anagram_dict[word] = [s] + anagram_dict.get(word, [])
        
        result = []
        for k,v in anagram_dict.items():
            result.append(v);        
        
        return result

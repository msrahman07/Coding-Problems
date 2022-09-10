"""
LeetCode: 125. Valid Palindrome
NeetCode: 10/150
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.
"""

class Solution:
    def isPalindrome(self, s: str) -> bool:
        left, right = 0, len(s)-1
        
        while(left < right):
            while(left < right and not self.alphanumeric(s[left])):
                left += 1
            
            while(left < right and not self.alphanumeric(s[right])):
                right -= 1
                
            if(s[left].lower() != s[right].lower()):
                return False
            
            left += 1
            right -= 1
        return True
                
#         newString = ""
#         for c in s:
#             if((c >= '0' and c <= '9') or (
#             c.lower() >= 'a' and c.lower() <= 'z')):
#                 newString += c.lower()
        
#         if(newString == newString[::-1]):
#             return True
#         else:
#             return False

    def alphanumeric(self, c):
        return(
            'A' <= c <= 'Z' or
            'a' <= c <= 'z' or
            '0' <= c <= '9'
        )

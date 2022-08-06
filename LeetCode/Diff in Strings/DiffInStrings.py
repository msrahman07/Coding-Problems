class Solution:
    def findTheDifference(self, s: str, t: str) -> str:
        charValS = 0
        charValT = 0
        
        for i in range(len(s)):
            charValS += ord(s[i])
            charValT += ord(t[i])
            
        charValT += ord(t[len(t)-1])
        
        
        return chr(charValT - charValS)

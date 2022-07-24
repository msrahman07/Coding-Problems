class Solution:
    def backspaceCompare(self, s: str, t: str) -> bool:
        S = ""
        T = ""
        
        for c in s:
            if(c == '#'):
                S = S[:len(S)-1]
            else:
                S += c
            
        for c in t:
            if(c == '#'):
                T = T[:len(T)-1]
            else:
                T += c
            
        if(S == T):
            return True
        else:
            return False
        

class Solution:
    def isPalindrome(self, x: int) -> bool:
        y = 0
        temp = x
        while(int(x) != 0):
            y += int(x%10) 
            y *= 10
            x /= 10
            
        if(temp == int(y/10)):
            return True
        else:
            return False
        

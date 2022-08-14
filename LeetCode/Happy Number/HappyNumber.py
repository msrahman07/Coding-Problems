class Solution:
    def isHappy(self, n: int) -> bool:
        s = str(n)
        hash_set = set()
        
        while(True):
            sum_n = 0
            for i in s:
                sum_n += int(i)*int(i)
            if(sum_n == 1):
                return True
            
            if(sum_n in hash_set):
                return False
            else:
                hash_set.add(sum_n)
            s = str(sum_n)
            
        return False

class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        if len(s)>=2:
            m = {s[0]:0}  # dictionary maping key = charactor of string and value = index
            st = 0
            max_count = 1
            for r in range(1,len(s)):
                if s[r] in m and m[s[r]] >= st:
                    max_count = max(r-st,max_count)
                    st = m[s[r]]+1  # update starting of string with previously found charactor index + 1
                    m[s[r]]=r  # update mapping with new value 
                else:
                    m[s[r]] = r
            return max(max_count,r-st+1)  # r-st+1 because we need to include last charactor also.
        elif len(s)==1:
            return 1
        else:
            return 0

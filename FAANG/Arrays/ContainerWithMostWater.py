class Solution:
    def maxArea(self, height: List[int]) -> int:
        first = 0
        last = len(height)-1
        maxarea = min(height[first], height[last])*(last-first)
        area = 0
        
        while(first < last):
            temp_height = min(height[first], height[last])
            area = temp_height*(last-first)
            maxarea = max(maxarea, area)
            if(temp_height == height[first]):
                first += 1
            else:
                last -= 1
                
                
        return maxarea
    
    
    

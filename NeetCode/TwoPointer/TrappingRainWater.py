"""
LeetCode: 42. Trapping Rain Water
NeetCode: 14/150

Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

"""

class Solution:
    def trap(self, height: List[int]) -> int:
        max_left = height[0]
        max_right = height[-1]
        left = 0
        right = len(height)-1
        max_rain = 0
        
        while(left < right):
            if(max_left <= max_right):
                left += 1
                max_left = max(max_left, height[left])
                max_rain += max_left - height[left]
                    
            else:
                right -= 1
                max_right = max(max_right, height[right])
                max_rain += max_right - height[right]
                    
                
        return max_rain
    
    
#         max_left = []
#         max_left_val = 0
#         max_right = []
#         max_right_val = 0
#         min_left_right = []
        
#         for i in range(len(height)):
#             max_left.append(max_left_val)
#             max_left_val = max(max_left_val, height[i])
            
#         for i in range(len(height)-1, -1, -1):
#             max_right.insert(0,max_right_val)
#             max_right_val = max(max_right_val, height[i])
        
#         for i in range(len(height)):
#             min_left_right.append(min(max_left[i], max_right[i]))
        
#         max_rain = 0
#         for i in range(len(height)):
#             if(min_left_right[i] - height[i] > 0):
#                 max_rain += min_left_right[i] - height[i]
        
        
#         return max_rain

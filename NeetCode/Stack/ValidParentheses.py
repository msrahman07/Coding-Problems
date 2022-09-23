"""
LeetCode: 20. Valid Parentheses
NeetCode: 21/150

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
"""

class Solution:
    def isValid(self, s: str) -> bool:
        lefty = ['(', '[', '{']
        righty = [')', ']', '}']
        
        stack = []
        
        for p in s:
            if(p in lefty):
                stack.append(p)
            elif(p in righty):
                if(len(stack) == 0):
                    return False
                if(righty.index(p) != lefty.index(stack.pop())):
                    return False
        return len(stack) == 0
#         left_parentheses = {
#                 '(': ')', 
#                 '[': ']', 
#                 '{': '}'
#             }
#         if(len(s) % 2 != 0): return False
        
#         stack = []
        
#         for p in s:
#             if(p in left_parentheses):
#                 stack.append(p)
#             else:
#                 if(len(stack) != 0):
#                     right_par = left_parentheses[stack.pop()]
#                     if(right_par != p):
#                         return False
#                 else:
#                     return False
        
#         return len(stack) == 0


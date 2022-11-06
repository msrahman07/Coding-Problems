"""
LeetCode: 150. Evaluate Reverse Polish Notation
"""

class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        op_stack = []
        operators = ["+", "-", "*", "/"]
        
        for t in tokens:
            if(t not in operators):
                op_stack.append(t)
            else:
                val2 = int(op_stack.pop())
                val1 = int(op_stack.pop())
                op_stack.append(self.arithmeticOp(val1,val2,t))
        
        return int(op_stack.pop())
            
        
    def arithmeticOp(self, val1:int, val2:int, op:str) -> int:
        match op:
            case "+":
                return val1+val2
            case "-":
                return val1-val2
            case "*":
                return val1*val2
            case "/":
                return val1/val2

"""
LeetCode: 155. Min Stack
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

Implement the MinStack class:

MinStack() initializes the stack object.
void push(int val) pushes the element val onto the stack.
void pop() removes the element on the top of the stack.
int top() gets the top element of the stack.
int getMin() retrieves the minimum element in the stack.
You must implement a solution with O(1) time complexity for each function.
"""

class MinStack:
    
    def __init__(self):
        self.stack = []
        self.min_stack = []
        self.current_min = math.pow(2,31)-1


    def push(self, val: int) -> None:
        self.stack.append(val)
        if(self.current_min >= val):
            self.min_stack.append(self.current_min)
            self.current_min = val

    def pop(self) -> None:
        val = self.stack.pop()
        if(val == self.current_min):
            self.current_min = self.min_stack.pop()
        

    def top(self) -> int:
        return self.stack[-1]

    def getMin(self) -> int:
        return self.current_min


# Your MinStack object will be instantiated and called as such:
# obj = MinStack()
# obj.push(val)
# obj.pop()
# param_3 = obj.top()
# param_4 = obj.getMin()

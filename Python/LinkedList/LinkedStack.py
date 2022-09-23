from Node import Node

class LinkedStack:
    def __init__(self):
        self._head = None
        self._size = 0

    def __len__(self):
        return self._size

    def is_empty(self):
        return self._size == 0

    def push(self, element):
        self._head = Node(element, self._head)
        self._size += 1

    def top(self):
        if(self._head == None):
            raise Empty("Stack is empty")
        return self._head

    def pop(self):
        if(self._head == None):
            raise Empty("Stack is empty")
        answer = self._head._element
        self._head = self._head._next
        self._size -= 1
        return answer

class Empty(Exception):
    pass


if __name__ == "__main__":
    stack = LinkedStack()
    stack.push(5)
    stack.push(4)
    stack.push(3)
    stack.push(2)
    print(4 == len(stack))
    print(2 == stack.pop())
    print(3 == stack.pop())
    print(4 == stack.pop())
    print(5 == stack.pop())
    print(stack.is_empty())

"""
def __init__(self):
        self._data = []

    def __len__(self):
        return len(self._data)

    def is_empty(self):
        return len(self._data) == 0

    def push(self, e):
        self._data.append(e)

    def top(self):
        if self.is_empty():
            raise Empty('Stack is empty')
        return self._data[-1]
    
    def pop(self):
        if self.is_empty():
            raise Empty('Stack is empty')
        return self._data.pop()
"""
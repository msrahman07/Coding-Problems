from Node import Node
class LinkedQueue:

    def __init__(self):
        self._head = None
        self._tail = None
        self._size = 0

    def __len__(self):
        return self._size

    def is_empty(self):
        return self._size == 0

    def first(self):
        if(self._head == None):
            raise Empty("Queue is empty")
        return self._head._element

    def enqueue(self, element):
        newNode = Node(element, None)
        if(self.is_empty()):
            self._head = newNode
        else:
            self._tail._next = newNode

        self._tail = newNode
        self._size += 1

    def dequeue(self):
        if(self.is_empty()):
            raise Empty("Queue is empty")
        answer = self._head._element
        self._head = self._head._next
        self._size -= 1
        if(self.is_empty()):
            self._tail = None
        return answer    

class Empty(Exception):
    pass


if __name__ == "__main__":
    Q = LinkedQueue()

    Q.enqueue(5)
    Q.enqueue(3)
    print(len(Q) == 2)
    print(Q.dequeue() == 5)
    print(Q.is_empty() == False)
    print(Q.dequeue() == 3)
    print(Q.is_empty() == True)
    # Q.dequeue() == "Queue is empty"
    Q.enqueue(7)
    Q.enqueue(9)
    print(Q.ﬁrst() == 7)
    Q.enqueue(4)
    print(len(Q) == 3)
    print(Q.dequeue() == 7)
"""
class ArrayQueue:
    def __init__(self):
        self._data = []

    def __len__(self):
        return len(self._data)

    def enqueue(self, item):
        self._data.append(item)

    def dequeue(self):
        if len(self._data) == 0:
            raise Empty("Queue is empty")
        return self._data.pop(0)

    def is_empty(self):
        return len(self._data) == 0
    
    def first(self):
        if len(self._data) == 0:
            raise Empty("Queue is empty")
        return self._data[0]
"""

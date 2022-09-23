from Node import Node

class CircularQueue():

    def __init__(self):
        self._tail = None
        self._size = 0

    def __len__(self):
        return self._size

    def is_empty(self):
        return self._size == 0

    def first(self):
        if(self.is_empty()):
            raise Empty("Queue is empty")
        head = self._tail.next
        return head._element
    
    def dequeue(self):
        if(self.is_empty()):
            raise Empty("Queue is empty")
        old_head = self._tail._next
        if(self._size == 1):
            self._tail = None
        else:
            self._tail._next = old_head._next
        self._size -= 1
        return old_head._element

    def enqueue(self, element):
        new_node = Node(element, None)
        if(self.is_empty()):
            new_node._next = new_node
        else:
            new_node._next = self._tail._next
            self._tail._next = new_node 
        self._tail = new_node
        self._size += 1

    def rotate(self):
        if(self._size > 0):
            self._tail = self._tail._next


class Empty(Exception):
    pass
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

class Empty(Exception):
    pass
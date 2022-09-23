class DoublyLinkedBase:
    class Node:
        __slots__ = '_element', '_prev', '_next'

        def __init__(self, element, prev, next):
            self._element = element
            self._prev = prev
            self._next = next

    
    def __init__(self) -> None:
        self._header = self.Node(None, None, None)
        self._tailer = self.Node(None, None, None)
        self._header._next = self._tailer
        self._tailer._prev = self._header
        self._size = 0

    def __len__(self) -> int:
        return self._size

    def is_empty(self) -> bool:
        return self._size == 0

    def _insert_between(self, elem, predecessor, successor):
        new_node = self.Node(elem, predecessor, successor)
        predecessor._next = new_node
        successor._prev = new_node
        self._size += 1
        return new_node

    def _delete_node(self, node):
        predecessor = node._prev
        successor = node._next
        predecessor._next = successor
        successor._prev = predecessor
        element = node._element
        node._next = node._prev = node = None
        self._size -= 1
        return element

    class Empty(Exception):
        pass

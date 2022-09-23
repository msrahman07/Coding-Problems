from DoublyLinkedBase import DoublyLinkedBase

class LinkedDeque(DoublyLinkedBase):

    def first(self):
        if(self.is_empty()):
            raise self.Empty("Queue is empty")
        return self._header._next._element

    def last(self):
        if(self.is_empty()):
            raise self.Empty("Queue is empty")
        return self._tailer._prev._element

    def insert_first(self, element):
        self._insert_between(element, self._header, self._header._next)

    def insert_last(self, element):
        self._insert_between(element, self._tailer._prev, self._tailer)

    def delete_first(self):
        if(self.is_empty()):
            raise self.Empty("Queue is empty")
        return self._delete_node(self._header._next)

    def delete_last(self):
        if(self.is_empty()):
            raise self.Empty("Queue is empty")
        return self._delete_node(self._tailer._prev)

    def print_list(self):
        if(self.is_empty()):
            return
        current = self._header._next
        while(current != self._tailer):
            print(current._element, " ")
            current = current._next

if __name__ =='__main__':
    dq = LinkedDeque()
    print(dq.is_empty())
    dq.insert_first(7)
    dq.insert_first(8)
    dq.insert_first(9)
    dq.insert_first(10)
    dq.insert_last(6)
    dq.insert_last(5)
    dq.insert_last(4)
    dq.insert_last(3)
    dq.insert_last(2)
    dq.insert_last(1)

    dq.print_list()
    print("\n")
    dq.delete_first()
    dq.delete_last()

    dq.print_list()

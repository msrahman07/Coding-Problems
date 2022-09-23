from ArrayStack import ArrayStack
from ArrayQueue import ArrayQueue

if __name__ == '__main__':
    # stack = ArrayStack()
    # stack.push(5)
    # stack.push(4)
    # stack.push(3)
    # stack.push(2)
    # print(4 == len(stack))
    # print(2 == stack.pop())
    # print(3 == stack.pop())
    # print(4 == stack.pop())
    # print(5 == stack.pop())
    # print(stack.is_empty())
    Q = ArrayQueue()

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
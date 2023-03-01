package ThreeStacksOneArray;

import java.util.EmptyStackException;

public class FixedMultiStack {
    // Fixed division
    // For stack 1, we use [0, n/3)
    // For stack 2, we use [n/3, 2n/3)
    // For stack 2, we use [2n/3, n)

    private int numberOfStacks = 3;
    private int stackCapacity;
    private int[] values;
    private int[] sizes;

    public FixedMultiStack(int stackSize) {
        stackCapacity = stackSize;
        values = new int[stackSize * numberOfStacks];
        sizes = new int[numberOfStacks];
    }

    // Push value onto stack
    public void push(int stackNum, int value) {
        if (isFull(stackNum)) {
            System.out.println("stack is full");
            return;
        }
        sizes[stackNum]++;
        values[indexOfTop(stackNum)] = value;
    }

    // Pop item from top stack
    public int pop(int stackNum) {
        if (isEmpty(stackNum)) {
            throw new EmptyStackException();
        }
        sizes[stackNum]--;
        int topIndex = indexOfTop(stackNum);
        int value = values[topIndex];
        values[topIndex] = 0;
        return value;

    }

    public int peek(int stackNum) {
        if (isEmpty(stackNum)) {
            throw new EmptyStackException();
        }
        return values[indexOfTop(stackNum)];
    }

    private boolean isEmpty(int stackNum) {
        return sizes[stackNum] == 0;
    }

    private int indexOfTop(int stackNum) {
        int offset = stackNum * numberOfStacks;
        return offset + sizes[stackNum] - 1;
    }

    private boolean isFull(int stackNum) {
        return sizes[stackNum] == stackCapacity;
    }

}

import java.util.LinkedList;
import java.util.Stack;

public class MinStack {
    private Stack<Integer> stack;
    private LinkedList<Integer> minList;
    private int currentMin;
    // private int size;

    public MinStack() {
        stack = new Stack<Integer>();
        minList = new LinkedList<Integer>();
        // size = 0;
        currentMin = Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        stack.push(val);
        if(val <= currentMin) {
            currentMin = val;
            minList.addLast(val);
        } else {
            minList.addFirst(val);
        }
        // size++;
    }
    
    public void pop() {
        int val = stack.pop();
        if(val == currentMin) {
            minList.removeLast();
            currentMin = minList.getLast();
        }
        // size--;
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return currentMin;
    }
    // // using one stack
    // private Stack<Integer> stack = new Stack();
    // private int currentMin = Integer.MAX_VALUE;
    // // private int size;

    // public MinStack() {
        
    // }
    
    // public void push(int val) {
    //     if(val <= currentMin) {
    //         stack.push(currentMin);
    //         currentMin = val;
    //     }
    //     stack.push(val);
    // }
    
    // public void pop() {
    //     if(stack.pop() == currentMin) {
    //         currentMin = stack.pop();
    //     }
    // }
    
    // public int top() {
    //     return stack.peek();
    // }
    
    // public int getMin() {
    //     return currentMin;
    // }
}

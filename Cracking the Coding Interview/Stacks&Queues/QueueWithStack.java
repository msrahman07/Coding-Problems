import java.util.Stack;

public class QueueWithStack {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;
    
    private int front;
    
    public QueueWithStack() {
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();
    }
    
    public void push(int x) {
        if(stack1.empty()) {
            front = x;
        }
        stack1.push(x);
    }
    
    public int pop() {
        if(stack2.empty()) {
            while(!stack1.empty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
    
    public int peek() {
        return (!stack2.empty()) ? stack2.peek() : front;
    }
    
    public boolean empty() {
        return stack1.empty() && stack2.empty();
    }
}

import java.util.Stack;

public class SortStack {
    public static void sortStack(Stack<Integer> stack) {
        Stack<Integer> stack2 = new Stack<Integer>();
        
        while(!stack.empty()) {
            int val = stack.pop();
            while(!stack2.empty() && val < stack2.peek()) {
                stack.push(stack2.pop());
            }
            stack2.push(val);
        }
        while(!stack2.empty()) {
            stack.push(stack2.pop());
        }
    }


    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        stack.push(1);
        stack.push(10);
        stack.push(12);
        stack.push(112);
        stack.push(120);
        stack.push(180);

        sortStack(stack);

        while(!stack.empty()) {
            System.out.println(stack.pop());
        }
    }
}
import java.util.ArrayList;
import java.util.Stack;
import java.util.TreeSet;

public class StackOfPlates {
    private ArrayList<Stack<Integer>> listOfStacks;
    private int capacity;
    TreeSet<Integer> availableStacks;

    public StackOfPlates(int capacity) {
        this.listOfStacks = new ArrayList<Stack<Integer>>();
        this.availableStacks = new TreeSet<Integer>();
        this.capacity = capacity;
    }
    
    public void push(int val) {
        if(availableStacks.isEmpty()) {
            listOfStacks.add(new Stack<Integer>());
            availableStacks.add(listOfStacks.size() - 1);
        }
        Stack<Integer> firstAvailableStack = listOfStacks.get(availableStacks.first());
        firstAvailableStack.push(val);
        
        if(firstAvailableStack.size() == capacity) {
            availableStacks.pollFirst();
        }
    }

    public int pop() {
        if(listOfStacks.isEmpty()) return -1;

        int val = listOfStacks.get(listOfStacks.size() - 1).pop();
        availableStacks.add(listOfStacks.size() - 1);

        while(!listOfStacks.isEmpty() && listOfStacks.get(listOfStacks.size() - 1).isEmpty()) {
            listOfStacks.remove(listOfStacks.size()-1);
            availableStacks.pollLast();
        }
        return val;
    }
    
    public int popAtStack(int index) {
        if(index < 0 || index >= listOfStacks.size()) return -1;

        if(index == listOfStacks.size()-1) return pop();

        Stack<Integer> requiredStack = listOfStacks.get(index);

        int val = (!requiredStack.isEmpty()) ? requiredStack.pop() : -1;
        availableStacks.add(index);
        return val;
    }
}

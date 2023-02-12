/*
 * LeetCode: 20. Valid Parentheses
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class CheckValidParenthesis {
    public boolean isValid(String s) {
        Map<Character, Character> parenMap = new HashMap();

        parenMap.put(')','(');
        parenMap.put('}', '{');
        parenMap.put(']', '[');
        Stack<Character> parenStack = new Stack();

        for(int i=0; i<s.length(); i++) {
            if(!parenMap.containsKey(s.charAt(i))) {
                parenStack.push(s.charAt(i));
            } else if(parenStack.isEmpty()){
                return false;
            } else if(parenStack.pop() != parenMap.get(s.charAt(i))){
                // char leftParen = parenStack.pop();
                // if(leftParen != parenMap.get(s.charAt(i))) {
                //     return false;
                // }
                return false;
            }
        }

        return parenStack.isEmpty();
    }
}

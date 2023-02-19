import java.util.Stack;

public class ParsingABooleanExpression {
    public boolean parseBoolExpr(String expression) {
        char closingParen = ')';
        char comma = ',';
        char startParent = '(';
        Stack<Character> expStack = new Stack<Character>();
        Stack<Character> subExp = new Stack<Character>();
        boolean answer = false;

        for(int i=0; i< expression.length(); i++) {
            char currentChar = expression.charAt(i);
            if(currentChar == comma) continue;

            if(currentChar != closingParen) {
                expStack.push(currentChar);
            }
            else {
                char innerExp = expStack.pop();
                while(innerExp != startParent) {
                    subExp.push(innerExp);
                    innerExp = expStack.pop();
                }
                
                char logicalExp = expStack.pop();
                answer = evalSubExp(subExp, logicalExp);
                if(answer == true) {
                    expStack.push('t');
                } else {
                    expStack.push('f');
                }
            }
        }
        
        return answer;
    }
    private boolean evalSubExp(Stack<Character> subExp, char logicalExp) {
        boolean answer = subExp.pop()=='t' ? true : false;

        if(logicalExp == '!') {
            answer = !answer;
        } else if(logicalExp == '&') {
            while(!subExp.isEmpty()) {
                answer &= (subExp.pop()=='t') ? true : false;
            }
        } else if(logicalExp == '|') {
            while(!subExp.isEmpty()) {
                answer |= (subExp.pop()=='t') ? true : false;
            }
        }
        return answer;
    }
}

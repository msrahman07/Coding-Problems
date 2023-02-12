import java.util.ArrayList;
import java.util.List;

public class GenerateValidParenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> parenList = new ArrayList();
        char[] str = new char[n*2];
        generateParenthesisHelper(parenList, n, n, str, 0);

        return parenList;
    }

    public void generateParenthesisHelper(List<String> parenList, int leftRem, int rightRem, char[] str, int index) {
        if(leftRem < 0 || rightRem < leftRem) return; //invalid parenthesis string
        if(leftRem == 0 && rightRem == 0) {
            parenList.add(String.copyValueOf(str));
        } else {
            str[index] = '(';
            generateParenthesisHelper(parenList, leftRem-1, rightRem, str, index+1);

            str[index] = ')';
            generateParenthesisHelper(parenList, leftRem, rightRem-1, str, index+1);
        }
    }
}

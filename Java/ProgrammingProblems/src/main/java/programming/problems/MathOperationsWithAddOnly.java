package programming.problems;

public class MathOperationsWithAddOnly {
    public int multiply(int a, int b) {
        // a=9, b=11
        int multiplier = 0;
        int number = 1;
        int answer = 0;
        if(a > b) {
            multiplier = b;
            number = a;
        } else {
            multiplier = a;
            number = b;
        }
        // multiplier = 9
        // number = 11
        for(int i=0; i<multiplier; i++) {
            answer += number;
        }
        return answer;
    }
    public int divide(int a, int b) {
        return a/b;
    }
}

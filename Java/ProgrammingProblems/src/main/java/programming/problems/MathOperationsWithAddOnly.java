package programming.problems;

public class MathOperationsWithAddOnly {
    public int multiply(int a, int b) {
        // a=9, b=11
        if(b > a) {
            return multiply(b, a); // algo is faster when b < a
        }
        int sum = 0;
        for(int i = 1; i <= abs(b); i++) {
            sum += a;
        }
        if(b < 0) {
            sum = negate(sum);
        }
        return sum;
    }

    public int divide(int a, int b) throws ArithmeticException {
        // a=9, b=11
        if(b == 0) {
            throw new ArithmeticException("Divided by zero"); // algo is faster when b < a
        }
        int absa = abs(a);
        int absb = abs(b);

        int product = 0;
        int x = 0;
        while(product + absb <= absa) {
            product += absb;
            x++;
        }

        if((a < 0 && b < 0) || (a > 0 && b > 0)) {
            return x;
        } else {
            return negate(x);
        }
    }

    private int abs(int num) {
        return num < 0 ? negate(num) : num;
    }
    public int subtract(int a, int b){
        return a + negate(b);
    }
    // Time comp for negate O(num)
//    private int negate(int num){
//        int newSign = a < 0 ? 1 : -1;
//        int neg = 0;
//
//        while(num != 0) {
//            num += newSign;
//            neg += neg;
//        }
//        return neg;
//    }
    private int negate(int a){
        int newSign = a < 0 ? 1 : -1;
        int neg = 0;
        int delta = newSign;

        while(a != 0) {
            boolean differentSigns = (a + delta > 0) != (a > 0);
            if(a + delta != 0 && differentSigns) {
                delta = newSign;
            }
            a += delta;
            neg += delta;
            delta += delta; // double the delta
        }
        return neg;
    }
}

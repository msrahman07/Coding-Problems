package programming.problems;

public class MinMaxNumWithoutComp {
//    if Integer.MIN_VALUE <= a-b <= Integer.MAX_VALUE
//    public int minNumber(int a, int b) {
//        int k = sign(a-b); // 1 if a>b, 0 if a<b
//        int q = flip(k); // 0 if a>b, 1 if a<b
//        return (a*q)+(b*k);
//    }
//
//    public int maxNumber(int a, int b) {
//        int k = sign(a-b); // 1 if a>b, 0 if a<b
//        int q = flip(k); // 0 if a>b, 1 if a<b
//        return (a*k)+(b*q);
//    }

//  if (a-b) overflow

    private int k;
    private int q;
    public int minNumber(int a, int b) {
        this.setKnadQ(a,b);
        return (a*q)+(b*k);
    }

    public int maxNumber(int a, int b) {
        this.setKnadQ(a,b);
        return a*this.k+b*this.q;
    }

    private void setKnadQ(int a, int b) {
        int c = a-b;
        int sa = sign(a); // if a >= 0, sa = 1 else, 0
        int sb = sign(b); // if b >= 0, sb = 1 else, 0
        int sc = sign(c); // if a-b >= 0, sc = 1 else, 0

        // if a > b, k = 1, else 0

        // if a and b are different sign, k = sign(a)
        int use_of_sign_a = sa ^ sb;
        // if a and b are same sign, k = sign(a-b)
        int use_of_sign_c = flip(sa ^ sb);

        this.k = use_of_sign_a*sa + use_of_sign_c*sc;
        this.q = flip(this.k);
    }

    // flip the bit; if 1 -> 0; if 0 -> 1
    private int flip(int bit) {
        return 1^bit;
    }
    // get sign of number; if positive return 1, if neg return 0
    private int sign(int num) {
        // (num >> 31): shifts first bit of 32 bit integer to the right 31 times
        // (& 0x1): finds out if last bit from above is 1 or 0. 1&1 = 1; 0&1 = 0;
        // (num >> 31) & 0x1) = 0 if positive, 1 if negative
        // then flip it to match condition
        return flip((num >> 31) & 0x1);
    }
}

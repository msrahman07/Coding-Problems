package programming.problems;

public class MinMaxNumWithoutComp {
    public int minNumber(int a, int b) {
        int k = sign(a-b); // 1 if a>b, 0 if a<b
        int q = flip(k); // 0 if a>b, 1 if a<b
        return (a*q)+(b*k);
    }

    public int maxNumber(int a, int b) {
        int k = sign(a-b); // 1 if a>b, 0 if a<b
        int q = flip(k); // 0 if a>b, 1 if a<b
        return (a*k)+(b*q);
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

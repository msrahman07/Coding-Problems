package programming.problems;

public class FactorialTrailingZeroes {
    // Time complexity O(log n)
    public int trailingZeroes(int n) {
        int numOfZeroes = 0;
        /*
         * Since zeroes come from multiple of 5
         * we add to numOfZeroes from how many multiples of 5 is in n
         * i.e. for n=125, numOfTrainingZeroes = 125/5 + 125/25 + 125/125
         * we have to multiply 5 with 5 since 25, 125, 625... and so on have more than one multiple of 5
         */
        for(int i=5; i<=n; i*=5) {
            numOfZeroes += n/i;
        }

        return numOfZeroes;
    }
    // Time complexity O(n)
    // public int trailingZeroes(int n) {
    //     int numOfZeroes = 0;

    //     for(int i=1; i<=n; i++) {
    //         numOfZeroes += factorsOf5(i);
    //     }

    //     return numOfZeroes;
    // }
    // private int factorsOf5(int n) {
    //     int count = 0;
    //     while(n%5 == 0) {
    //         n /= 5;
    //         count++;
    //     }
    //     return count;
    // }
}

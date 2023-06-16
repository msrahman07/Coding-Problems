public class FactorialZeros {
    /* if the number is a 5 of five, return which power of 5. For example: 5 -> 1,
     * 25 -> 2, etc.
    */
    int factorsOf5(int i) {
        int count = 0;
        while(i % 5 == 0) {
            count++;
            i /= 5;
        }
        return count;
    }

    int countFactZeros(int num) {
        int count = 0;
        if(num < 0) {
            return -1;
        }
        for(int i = 5; num / i > 0; i *= 5) {
            count += num/i;
        }
        return count;
    }
}

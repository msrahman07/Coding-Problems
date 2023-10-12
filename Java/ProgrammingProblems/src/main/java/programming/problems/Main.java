package programming.problems;

import java.lang.reflect.Type;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GenerateCombinations combinations = new GenerateCombinations();
        SwapNumbersWithoutTempVar swpnum = new SwapNumbersWithoutTempVar();
        int[] nums = {23, 11};
        System.out.println(nums[0]+", "+nums[1]);
        swpnum.swap(nums[1], nums[0]);
        System.out.println(nums[0]+", "+nums[1]);
    }

    public static void printNumberCalc(int number) {
        do {
            int remainder = number % 10;
            number /= 10;
            System.out.println(remainder);
        } while(number > 0);
    }
}

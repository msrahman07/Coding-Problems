package programming.problems;

import java.lang.reflect.Type;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GenerateCombinations combinations = new GenerateCombinations();

    }

    public static void printNumberCalc(int number) {
        do {
            int remainder = number % 10;
            number /= 10;
            System.out.println(remainder);
        } while(number > 0);
    }
}

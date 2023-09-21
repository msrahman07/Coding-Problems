package programming.problems;

import java.lang.reflect.Type;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        ReverseWords rvwords =  new ReverseWords();
//        IntegerStringConversion intString = new IntegerStringConversion();
//
//        System.out.println(rvwords.reverseWords("   Hello    World   "));
//        System.out.println(rvwords.reverseWords("   HelloWorld   "));
//        System.out.println(rvwords.reverseWords("HelloWorld"));
//        System.out.println(rvwords.reverseWords(""));
//        System.out.println((""+(Integer.MIN_VALUE)));
//        System.out.println((""+(Integer.MAX_VALUE)));
//        printNumberCalc(1111);
//        StringBuilder stringBuilder = new StringBuilder("Hello World");
//        stringBuilder.deleteCharAt(stringBuilder.length()-1);
//        System.out.println(stringBuilder.toString());

        StringPermutations stringPermutations = new StringPermutations();

        List<String> permutations = stringPermutations.permute("abcdef");
        for(String str : permutations) {
            System.out.println(str);
        }
        System.out.println(permutations.size());
    }

    public static void printNumberCalc(int number) {
        do {
            int remainder = number % 10;
            number /= 10;
            System.out.println(remainder);
        } while(number > 0);
    }
}

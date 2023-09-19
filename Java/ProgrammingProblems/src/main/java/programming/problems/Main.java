package programming.problems;

import java.lang.reflect.Type;

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
        int intValue = 97;
        byte utf8Byte = (byte)(intValue & 0xFF);
        System.out.printf("UTF-8 Byte: %02X\n", utf8Byte);
    }

    public static void printNumberCalc(int number) {
        do {
            int remainder = number % 10;
            number /= 10;
            System.out.println(remainder);
        } while(number > 0);
    }
}

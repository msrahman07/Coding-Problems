package programming.problems;

import java.lang.reflect.Type;

public class Main {
    public static void main(String[] args) {
        ReverseWords rvwords =  new ReverseWords();
        IntegerStringConversion intString = new IntegerStringConversion();

        System.out.println(rvwords.reverseWords("   Hello    World   "));
        System.out.println(rvwords.reverseWords("   HelloWorld   "));
        System.out.println(rvwords.reverseWords("HelloWorld"));
        System.out.println(rvwords.reverseWords(""));
        System.out.println((""+(Integer.MIN_VALUE)));
        System.out.println((""+(Integer.MAX_VALUE)));
    }
}

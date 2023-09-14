package programming.problems;

public class Main {
    public static void main(String[] args) {
        ReverseWords rvwords =  new ReverseWords();

        System.out.println(rvwords.reverseWords("   Hello    World   "));
        System.out.println(rvwords.reverseWords("   HelloWorld   "));
        System.out.println(rvwords.reverseWords("HelloWorld"));
        System.out.println(rvwords.reverseWords(""));
        System.out.println(rvwords.reverseWords("this is         another                example"));
    }
}

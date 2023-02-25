import java.util.HashSet;
import java.util.Set;

public class PalindromePermutation {
    public static boolean isPalindromePermutation(String str) {
        Set<Character> charCounter = new HashSet<Character>();
        
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' ') continue;
            if(charCounter.contains(str.charAt(i))) {
                charCounter.remove(str.charAt(i));
            } else {
                charCounter.add(str.charAt(i));
            }
        }
        return charCounter.size() <= 1;
    }

    public static void main(String[] args) {
        System.out.println(isPalindromePermutation("taco car"));
    }
}

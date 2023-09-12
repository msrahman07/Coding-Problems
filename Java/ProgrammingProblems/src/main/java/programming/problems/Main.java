package programming.problems;

public class Main {
    public static void main(String[] args) {
        RemoveSpecifiedCharacters rmvChar = new RemoveSpecifiedCharacters();
        StringBuilder str = new StringBuilder("Battle of the Vowels: Hawaii vs. Grozny");
        rmvChar.removeChars(str, "Grozny");
        System.out.println(str.toString().equals("Bttl f th Vwls: Hw vs. Grzny"));
        System.out.println(str.toString());
    }
}

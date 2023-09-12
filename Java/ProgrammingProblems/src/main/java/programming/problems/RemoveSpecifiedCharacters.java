package programming.problems;

/*
PROBLEM Write an efficient function that deletes characters from a mutable
ASCII string. Your function should take two arguments, str and remove . Any
character existing in remove must be deleted from str . For example, given
a str of "Battle of the Vowels: Hawaii vs. Grozny" and a remove of
"aeiou" , the function should transform str to "Bttl f th Vwls: Hw vs.
Grzny" . Justify any design decisions you make, and discuss the efficiency of your
solution.
 */

import java.util.HashSet;

public class RemoveSpecifiedCharacters {
    public void removeChars(StringBuilder str, String remove) {
        HashSet<Character> removeSet = new HashSet<Character>();

        for (int i = 0; i < remove.length(); i++) {
            removeSet.add(remove.charAt(i));
        }
        for(int i = 0; i < str.length(); i++) {
            if(removeSet.contains(str.charAt(i))) {
                str.deleteCharAt(i);
                i--; // since we are deleting a character from string, we are reducing index number
            }
        }
    }
}

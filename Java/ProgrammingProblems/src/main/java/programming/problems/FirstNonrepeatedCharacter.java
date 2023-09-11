package programming.problems;

/*
    PROBLEM Write an efficient function to find the first nonrepeated character
    in a string. For instance, the first nonrepeated character in “ total ” is ‘ o ’ and
    the first nonrepeated character in “ teeter ” is ‘ r ’. Discuss the efficiency of your
    algorithm.
*/

import java.util.HashMap;

public class FirstNonrepeatedCharacter {
    public Character findFirstNonrepeatedChar(String str) {
        HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
        for(int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if(charMap.containsKey(currentChar)) {
                charMap.put(currentChar, charMap.get(currentChar)+1);
            } else {
                charMap.put(currentChar, 1);
            }
        }

        for(int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if(charMap.get(currentChar) == 1) {
                return currentChar;
            }
        }

        return null;
    }
}

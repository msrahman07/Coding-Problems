package programming.problems;

import java.util.ArrayList;
import java.util.List;

public class TelephoneWords {
    private List<String> result;
    private StringBuilder newCombination;
    private String[] numToLetter;

    public TelephoneWords() {
        result = new ArrayList<>();
        newCombination = new StringBuilder();
        numToLetter = new String [] {"", "", "abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    }

    public List<String> letterCombination(String digits) {
        if(!digits.isEmpty()) {
            combineHelper(0, digits);
        }
        return result;
    }

    private void combineHelper(int currPos, String digits) {
        if(newCombination.length() == digits.length()) {
            result.add(newCombination.toString());
            return;
        }
        String currSlot = numToLetter[digits.charAt(currPos)-'0'];

        for(int i=0; i<currSlot.length(); i++) {
            newCombination.append(currSlot.charAt(i));
            combineHelper(currPos+1, digits);
            newCombination.deleteCharAt(newCombination.length()-1);
        }
    }

}

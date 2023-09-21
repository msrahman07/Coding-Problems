package programming.problems;

import java.util.ArrayList;
import java.util.List;

public class StringPermutations {
    List<String> result = new ArrayList<String>();
    StringBuilder currentPermutation = new StringBuilder();

    public List<String> permute(String str) {
        boolean[] charUsed = new boolean[str.length()];
        permuteHelper(str, charUsed);
        return result;
    }

    private void permuteHelper(String str, boolean[] charUsed) {
        if(currentPermutation.length() == str.length()) {
            result.add(currentPermutation.toString());
        }
        for(int i=0; i<str.length(); i++) {
            if(!charUsed[i]) {
                charUsed[i] = true;
                currentPermutation.append(str.charAt(i));
                permuteHelper(str, charUsed);
                currentPermutation.deleteCharAt(currentPermutation.length()-1);
                charUsed[i] = false;
            }
        }
    }



}

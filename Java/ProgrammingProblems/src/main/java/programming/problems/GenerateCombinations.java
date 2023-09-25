package programming.problems;

import java.util.ArrayList;
import java.util.List;

public class GenerateCombinations {
    List<List<Integer>> result;

    public List<List<Integer>> combine(int n, int k) {
        result = new ArrayList<List<Integer>>();
        combineHelper(1, n, k, new ArrayList<Integer>());
        return result;
    }

    private void combineHelper(int start, int n, int k, List<Integer> currentCombination) {
        if(k==0) {
            result.add(new ArrayList<>(currentCombination));
            return;
        }

        for(int i=start; i<=n-k+1; i++) {
            currentCombination.add(i);
            combineHelper(i+1, n, k-1, currentCombination);
            currentCombination.remove(currentCombination.size()-1);
        }
    }
}

// wxyz
// C(4,1) = w, x, y, z - take each letter
// C(4,2) = wx, wy, wz, xy, xz, yz
// C(4,3) = wxy, wyz, xyz
// C(4, 4) = wxyz
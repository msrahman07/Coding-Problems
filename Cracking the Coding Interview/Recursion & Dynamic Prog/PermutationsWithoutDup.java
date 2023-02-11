import java.util.ArrayList;
import java.util.List;

public class PermutationsWithoutDup {
    List<List<Integer>> result = new ArrayList<List<Integer>>();

    List<Integer> currentPermute = new ArrayList<Integer>();

    public List<List<Integer>> permute(int[] nums) {
        boolean[] numUsed = new boolean[nums.length];
        permuteHelper(nums, numUsed);
        return result;
    }

    private void permuteHelper(int[] nums, boolean[] numUsed) {

        if(currentPermute.size() == nums.length) {
            result.add(List.copyOf(currentPermute));
            return;
        }
        for(int i=0; i<nums.length; i++) {
            if(!numUsed[i]) {
                numUsed[i] = true;
                currentPermute.add(nums[i]);
                permuteHelper(nums, numUsed);
                numUsed[i] = false;
                currentPermute.remove(currentPermute.size()-1);
            }
        }
    }
}

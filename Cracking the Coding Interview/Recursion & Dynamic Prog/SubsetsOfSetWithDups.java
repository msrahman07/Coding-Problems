import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubsetsOfSetWithDups {
    Set<List<Integer>> allSubsets = new HashSet<List<Integer>>();
    List<Integer> subset = new ArrayList<Integer>();
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> listOfSubsets = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        getSubsets(nums, 0);
        listOfSubsets.addAll(allSubsets);
        return listOfSubsets;
    }

    private void getSubsets(int[] nums, int index) {
        if(index >= nums.length) {
            // List<Integer> newSubset = new ArrayList();
            // newSubset.addAll(subset);
            // newSubset.sort((a, b) -> a-b);
            allSubsets.add(List.copyOf(subset));
            return;
        }

        subset.add(nums[index]);
        getSubsets(nums, index+1);
        subset.remove(subset.size()-1);
        getSubsets(nums, index+1);
    }
}

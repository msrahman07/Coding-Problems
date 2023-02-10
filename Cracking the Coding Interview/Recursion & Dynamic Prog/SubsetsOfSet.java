import java.util.LinkedList;
import java.util.List;

public class SubsetsOfSet {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> allSubsets = new LinkedList<List<Integer>>();

        LinkedList<Integer> subset = new LinkedList<Integer>();

        getSubsetsBackTrack(nums, allSubsets, subset, 0);
        return allSubsets;
    }

    // two choices for each number. Either add or don't add
    private void getSubsetsBackTrack(int[] nums, List<List<Integer>> allSubsets,
            LinkedList<Integer> subset, int index) {
        if (index >= nums.length) {
            allSubsets.add(List.copyOf(subset));
            return;
        }
        //
        subset.addLast(nums[index]);
        getSubsetsBackTrack(nums, allSubsets, subset, index + 1);

        subset.removeLast();
        getSubsetsBackTrack(nums, allSubsets, subset, index + 1);

        // return allSubsets;
    }

    public List<List<Integer>> subsetsCascade(int[] nums) {
        List<List<Integer>> allSubsets = new LinkedList<List<Integer>>();

        List<Integer> subset = new LinkedList<Integer>();
        allSubsets.add(List.copyOf(subset));

        for (int n : nums) {
            List<List<Integer>> newSubsets = new LinkedList<List<Integer>>();

            for (List<Integer> sub : allSubsets) {
                newSubsets.add(new LinkedList<Integer>(sub) {
                    {
                        add(n);
                    }
                });
            }
            for (List<Integer> newSub : newSubsets) {
                allSubsets.add(List.copyOf(newSub));
            }
        }
        return allSubsets;
    }
}

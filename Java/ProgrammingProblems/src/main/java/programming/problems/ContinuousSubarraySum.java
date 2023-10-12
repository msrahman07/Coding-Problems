package programming.problems;

import java.util.HashMap;

public class ContinuousSubarraySum {
    public boolean checkSubarraySum(int[] nums, int k) {
        if(k == 0 || nums.length < 2) return false;

        HashMap<Integer, Integer> remainderMap =  new HashMap<Integer, Integer>();
        remainderMap.put(0, -1);
        int runningSum = 0;
        int currentRem = 0;

        for(int i = 0; i < nums.length; i++) {
            runningSum += nums[i];
            currentRem = runningSum % k;

            if(remainderMap.containsKey(currentRem)) {
                if(i - remainderMap.get(currentRem) >= 2) {
                    return true;
                }
            } else {
                remainderMap.put(currentRem, i);
            }
        }
        return false;
    }
}

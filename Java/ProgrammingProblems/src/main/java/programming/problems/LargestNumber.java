package programming.problems;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {
    public String largestNumber(int[] nums) {
        String[] numStringArr = new String[nums.length];

        for(int i=0; i<nums.length; i++) {
            numStringArr[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(numStringArr, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                String n1 = s1+s2, n2 = s2+s1;
                return n2.compareTo(n1);
            }
        });
        if(numStringArr[0].equals("0")) return "0";
        return String.join("",numStringArr);
    }
}

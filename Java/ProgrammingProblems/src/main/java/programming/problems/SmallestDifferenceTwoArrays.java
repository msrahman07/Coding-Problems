package programming.problems;

import java.util.Arrays;

public class SmallestDifferenceTwoArrays {
    public int smallestDifference(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int smallestDiff = Integer.MAX_VALUE;
        int a = 0;
        int b = 0;

        while(a < arr1.length && b < arr2.length) {
            smallestDiff = Math.min(smallestDiff, Math.abs(arr1[a]-arr2[b]));
            if(arr1[a] < arr2[b]) {
                a++;
            } else {
                b++;
            }
        }

        return smallestDiff;
    }
//    Time Comp: O(AB) - A = arr.length, B =  arr2.length
//    public int smallestDifference(int[] arr1, int[] arr2) {
//        int smallestDiff = Integer.MAX_VALUE;
//
//        for(int i=0; i<arr1.length; i++) {
//            for (int j = 0; j < arr2.length; j++) {
//                smallestDiff = Math.min(smallestDiff, Math.abs(arr1[i]-arr2[j]));
//            }
//        }
//        return smallestDiff;
//    }
}

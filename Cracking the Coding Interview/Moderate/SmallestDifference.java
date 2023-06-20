import java.util.*;

class SmallestDifference {
    public static int findSmallestDifference(int[] array1, int[] array2) {
        int a = 0;
        int b = 0;
        Arrays.sort(array1);
        Arrays.sort(array2);
        int diff = Integer.MAX_VALUE;
        
        while(a < array1.length && b < array2.length) {
            if(Math.abs(array1[a] - array2[b]) < diff) {
                diff = Math.abs(array1[a] - array2[b]);
            }
            if(array1[a] < array2[b]) {
                a++;
            } else {
                b++;
            }
        }
        return diff;
    }
    public static void main(String[] args) {
        int[] arr1 = new int[] {1, 3, 15, 11, 2};
        int[] arr2 = new int[] {23, 127, 235, 19, 8};
        System.out.println(findSmallestDifference(arr1, arr2));
    }
}
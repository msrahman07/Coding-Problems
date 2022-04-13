import java.util.ArrayList;
import java.util.List;
class IntersectionofTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> intersect = new ArrayList<Integer>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int i = 0;
        int j = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i]==nums2[j]){
                intersect.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i] < nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        int[] arr = new int[intersect.size()];
        for(int n=0; n<arr.length;n++){
            arr[n] = intersect.get(n);
        }
        return arr;
    }
}

class MergedSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = m+n-1; i>=0;i--){
            //check second array is empty, which means merged array is sorted
            if(n-1<0){
                return;
            }
            //till we check all elements of first array, compared with second array, inserting largest number at the back of the array
            if(m-1>=0 && nums1[m-1]>nums2[n-1]){
                nums1[i] = nums1[m-1];
                m--;
            }
            else{
                nums1[i] = nums2[n-1];
                n--;
            }
        }
    }
}

class ProductofArray {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int pref = 1;
        int suf = 1;
        //Arrays.fill(ans, 1);
        for(int i=0; i<nums.length; i++){
            ans[i]=1;
        }
        
        for(int i=0, j=nums.length-1; i<nums.length; i++, j--){
            ans[i] *= pref;
            ans[j] *= suf;
            pref *= nums[i];
            suf *= nums[j];
        }
        return ans;
    }
}

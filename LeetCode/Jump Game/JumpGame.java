class JumpGame {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        int maxreachable = 0;
        for(int i=0;i<n;i++){
            if(i>maxreachable){
                return false;
            }
            maxreachable = Math.max(maxreachable,i+nums[i]);
        }
        return true;
    }
}

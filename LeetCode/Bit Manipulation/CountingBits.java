class CountingBits {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
//         for(int i=0; i<=n; i++){
//             int j = i;
//             int ones = 0;
//             while(j!=0){
//                 ones += j & 1;
//                 j = j >> 1;
//             }
//             ans[i] = ones;
//         }
        ans[0] = 0;
        for(int i=1; i<=n; i++){
            if(i%2==0){ //even
                ans[i] = ans[i/2];
            }
            else{
                ans[i] = ans[i/2]+1;
            }
        }
        return ans;
    }
}

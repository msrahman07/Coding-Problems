class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n < 0){
            return false;
        }
        double log2n = Math.log(n)/Math.log(2);
        double ans = (Math.round((log2n - (double)(int)log2n)*10E10)/10E10);
        if(ans == 0){
            return true;   
        }
        return false;
    }
}

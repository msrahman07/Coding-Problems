class Solution {
    public int mySqrt(int x) {
        int i = 0;
        int j = x;
        while(i<=j){
            long m = i + (j-i)/2;
            if(m*m > x)
                j = (int)m-1;
            else
                i = (int)m+1;
        }
        return j;
        
    }
}

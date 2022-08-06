class Solution {
    public int numDecodings(String s) {
        int[] dp=new int[s.length()];
        if(s.charAt(0)!='0'){
            dp[0]=1;
        }
        for(int i=1;i<s.length();i++){
            String str=s.substring(i-1,i+1);
            if(s.charAt(i)!='0'){
                dp[i]=dp[i-1];
            }
            if(Integer.valueOf(str)>=1 && Integer.valueOf(str)<=26 && s.charAt(i-1)!='0'){
                if(i-2<0){
                    dp[i]+=1;
                }
                else{
                    dp[i]+=dp[i-2];
                }
            }
        }
        return dp[s.length()-1];
    }
}

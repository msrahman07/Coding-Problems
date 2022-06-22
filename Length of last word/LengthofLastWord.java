class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        int strLen = s.length()-1;
        int j=strLen;
        
        while(strLen >= 0){
            if(s.charAt(strLen) >= 48){
                break;
            }
            strLen--;
        }
        for(int i=strLen; i>=0; i--){
            if(s.charAt(i) == 32){
                return count;
            }
            count++;
        }
        return count;        

    }
}

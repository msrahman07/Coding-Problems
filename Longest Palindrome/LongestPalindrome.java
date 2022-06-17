class Solution {
    public int longestPalindrome(String s) {
        // if(s.length()==1){
        //     return s.length();
        // }
        // Set<Character> charSet = new HashSet<>();
        // String answer = "";
        // for(int i=0; i<s.length(); i++){
        //     if(charSet.contains(s.charAt(i))){
        //         answer = s.charAt(i) + answer + s.charAt(i);
        //         charSet.remove(s.charAt(i));
        //     }else{
        //         charSet.add(s.charAt(i));
        //     }
        // }
        // if(charSet.size() > 0){
        //     answer = answer.substring(0, answer.length()/2) + '*' + answer.substring(answer.length()/2);
        // }
        // return answer.length();
        int[] count = new int[128];
        for (char c: s.toCharArray())
            count[c]++;

        int ans = 0;
        for (int v: count) {
            ans += v / 2 * 2;
            if (ans % 2 == 0 && v % 2 == 1)
                ans++;
        }
        return ans;
    }
}

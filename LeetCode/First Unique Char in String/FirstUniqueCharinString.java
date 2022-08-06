class FirstUniqueCharinString {
    public int firstUniqChar(String s) {
        // Map<Character, Integer> map = new HashMap<>();
        // char ch;
        // int len = s.length();
        // for(int i=0; i<len; i++){
        //     ch = s.charAt(i);
        //     if(!map.containsKey(ch)){
        //         map.put(ch, i);
        //     }
        //     else{
        //         map.put(ch, i+len);
        //     }
        // }
        // int result = Collections.min(map.values());
        // if(result < len){
        //     return result;
        // }
        // return -1;
        //===========================================
        // for(int i=0; i<s.length(); i++){
        //     if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
        //         return i;
        //     }
        // }
        //==========================================
        int[] alpha = new int[26];
        
        for(int i=0; i<s.length(); i++){
            alpha[s.charAt(i)-'a'] = alpha[s.charAt(i)-'a']+1; 
        }
        for(int i=0; i<s.length(); i++){
            if(alpha[s.charAt(i)-'a'] == 1){
                return i;
            }
        }
        return -1;
    }
}

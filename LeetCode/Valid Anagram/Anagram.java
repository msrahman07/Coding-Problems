class Anagram {
    public boolean isAnagram(String s, String t) {
        int[] letters = new int[26];

        int sum = 0;
        for(int i=0; i<s.length(); i++){
            letters[s.charAt(i)-'a']++;
            sum++;
        }
        for(int j=0; j<t.length(); j++){
            letters[t.charAt(j)-'a']--;
            sum--;
            if(letters[t.charAt(j)-'a'] < 0){
                return false;
            }
        }
        if(sum != 0){
            return false;
        }
        return true;
    }
}

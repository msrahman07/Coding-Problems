/*
Given two strings ransomNote and magazine, return true if ransomNote can be constructed from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.
*/

class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        // Map<Character, Integer> maga_map= new HashMap<>();
        // for(int i=0; i<magazine.length(); i++){
        //     if(maga_map.containsKey(magazine.charAt(i))){
        //         maga_map.put(magazine.charAt(i), maga_map.get(magazine.charAt(i))+1);
        //     }
        //     else{
        //         maga_map.put(magazine.charAt(i), 1);
        //     }
        // }
        // for(int j=0; j<ransomNote.length(); j++){
        //     if(maga_map.containsKey(ransomNote.charAt(j))){
        //         maga_map.put(ransomNote.charAt(j), maga_map.get(ransomNote.charAt(j))-1);
        //         if(maga_map.get(ransomNote.charAt(j)) == -1){
        //             return false;
        //         }
        //     }
        //     else{
        //         return false;
        //     }
        // }
        int[] letters = new int[26];
        for(int i=0; i<magazine.length(); i++){
            letters[magazine.charAt(i) -'a']++;
        }
        for(int j=0; j<ransomNote.length(); j++){
            letters[ransomNote.charAt(j) -'a']--;
            if(letters[ransomNote.charAt(j) -'a'] <0){
                return false;
            }
        }
        
        return true;
    }
}

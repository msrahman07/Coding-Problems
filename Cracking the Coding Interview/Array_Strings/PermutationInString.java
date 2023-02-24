public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;

        int[] s1Counter = new int[26];
        int[] s2Counter = new int[26];

        for(int i = 0; i < s1.length(); i++) {
            s1Counter[s1.charAt(i)-'a'] += 1;
            s2Counter[s2.charAt(i)-'a'] += 1;
        }

        int matches = 0;

        for(int i=0; i<26; i++) {
            if(s1Counter[i] == s2Counter[i]) matches++;
        }

        int left = 0;

        for(int i = s1.length(); i < s2.length(); i++) {
            if(matches == 26) return true;
            
            int index = s2.charAt(i) - 'a';
            s2Counter[index] += 1;

            if(s1Counter[index] == s2Counter[index]) {
                matches++;
            } else if(s1Counter[index]+1 == s2Counter[index]) {
                matches--;
            }

            index = s2.charAt(left) - 'a';

            s2Counter[index] -= 1;
            if(s1Counter[index] == s2Counter[index]) {
                matches++;
            } else if(s1Counter[index]-1 == s2Counter[index]) {
                matches--;
            }
            left++;
        }

        return matches == 26;
    }
}

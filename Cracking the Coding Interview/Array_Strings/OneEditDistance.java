public class OneEditDistance {
    public static boolean oneEditAway(String s1, String s2) {
        if(s1.length() == s2.length()) {
            return oneReplaceAway(s1, s2);
        }
        if(s1.length() + 1 == s2.length()) {
            return oneInsertAway(s1, s2);
        }
        if(s1.length() - 1 == s2.length()) {
            return oneInsertAway(s2, s1);
        }
        return false;
    }

    private static boolean oneInsertAway(String shortString, String longString) {
        int index1 = 0;
        int index2 = 0;

        while(index1 < shortString.length() && index2 < longString.length()) {
            if(shortString.charAt(index1) != longString.charAt(index2)) {
                if(index1 != index2) {
                    return false;
                }
                index2++;
            } else {
                index1++; index2++;
            }
        }
        return true;
    }

    private static boolean oneReplaceAway(String s1, String s2) {
        boolean replaced = false;

        for(int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) != s2.charAt(i)) {
                if(replaced) {
                    return false;
                }
                replaced = true;
            }
        }
        return replaced;
    }

    public static void main(String[] args) {
        System.out.println(oneEditAway("pale", "bale"));    
        System.out.println(oneEditAway("pale", "ple"));    
        System.out.println(oneEditAway("pales", "pale"));    
        System.out.println(oneEditAway("pale", "bae"));    
    }
}

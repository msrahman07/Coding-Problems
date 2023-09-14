package programming.problems;
/*
PROBLEM Write a function that reverses the order of the words in a string. For
example, your function should transform the string “Do or do not, there is no
try.” to “try. no is there not, do or Do”. Assume that all words are space delim-
ited and treat punctuation the same as letters.
 */
public class ReverseWords {
    public String reverseWords(String str) {
        char[] letters = str.toCharArray();
        int length = str.length();
        reverse(letters, 0, length-1);

        int start = 0;
        int end = 0;

        while(end < length) {
            // find start of word
            while(end < length && letters[end] == ' ') {
                end++;
            }
            start = end;
            // find end of word
            while(end < length && letters[end] != ' ') {
                end++;
            }
            reverse(letters, start, end-1);
        }

        int newLength = 0;

        for(int i=0; i<length; i++) {
            if(!(letters[i] == ' ' && (i == 0 || letters[i-1] == ' '))) {
                letters[newLength++] = letters[i];
            }
        }

        return new String(letters, 0, newLength).trim();
    }

    private static void reverse(char[] letters, int start, int end) {
        while(start < end) {
            char temp = letters[end];
            letters[end] = letters[start];
            letters[start] = temp;
            start++;
            end--;
        }
    }
}

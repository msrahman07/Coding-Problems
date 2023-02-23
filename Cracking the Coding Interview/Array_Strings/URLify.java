/*
 * Write a method to replace all spaces in a string with 
 * '%20'. You may assume that the string
has sufficient space at the end to hold the additional characters, and that you are given the "true"
length of the string. (Note: if implementing in Java, please use a character array so that you can
perform this operation in place.)
 */

public class URLify {
    public static String replaceSpaces(String str) {
        int trueLength = str.length();
        str = str.trim();
        char[] strChars = new char[trueLength];
        int index = 0;

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' ') {
                strChars[index] = '%';
                strChars[index+1] = '2';
                strChars[index+2] = '0';
                index += 3;
            } else {
                strChars[index] = str.charAt(i);
                index++;
            }
        }
        return new String(strChars);
    }

    public static void main(String[] args) {
        String test1 = "Mr John Smith    ";
        String test1Answer = "Mr%20John%20Smith";
        System.out.println(test1Answer.equals(replaceSpaces(test1)));
        System.out.println(replaceSpaces(test1).length());
    }
}
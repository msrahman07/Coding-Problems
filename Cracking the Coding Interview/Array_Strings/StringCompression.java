// 443. String Compression
public class StringCompression {
    public int compress(char[] chars) {
        int newStringIndex = 0;

        for(int i = 0; i < chars.length; i++) {
            char currentChar = chars[i];
            int currentGroupLen = 1;
            int right = i+1;
            while(right < chars.length && chars[right] == currentChar) {
                right++;
                currentGroupLen++;
            }
            i = right-1;
            chars[newStringIndex] = currentChar;
            newStringIndex++;
            if(currentGroupLen > 1) {
                char[] currGroupLenArray = String.valueOf(currentGroupLen).toCharArray();
                for(int j = 0; j < currGroupLenArray.length; j++) {
                    chars[newStringIndex] = currGroupLenArray[j];
                    newStringIndex++;
                }
            }
        }
        return newStringIndex;
    }
}

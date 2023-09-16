package programming.problems;

public class IntegerStringConversion {

    // Converts string to signed integer
    public int stringToInt(String numberStr) throws NumberFormatException {
        numberStr = numberStr.trim();
        int start = 0;
        boolean isNeg = false;
        int length = numberStr.length();

        if(length == 0) throw new NumberFormatException("Empty String");
        int number = 0;
        if(numberStr.charAt(0) == '-') {
            isNeg = true;
            start++;
//            length--;
        }
        while(start < numberStr.length()) {
            number += checkValidNumber(numberStr.charAt(start) - '0')*(int)(Math.pow(10, (length-start-1)));
            start++;
        }
        if(isNeg) number *= -1;

        return number;
    }

    private int checkValidNumber(int number) throws NumberFormatException {
        if(number < 0 || number > 9) {
            throw new NumberFormatException("String is not a valid number");
        }
        return number;
    }
}

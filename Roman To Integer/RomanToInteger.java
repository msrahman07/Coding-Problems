class Solution {
    public int romanToInt(String s) {
        int temp = 0;
        int temp2 = 1000;
        int sum = 0;
        for(int i = 0; i < s.length(); i++) {
            switch(s.charAt(i)) {
                case 'M':
                    temp = 1000;
                    break;
                case 'D':
                    temp = 500;
                    break;
                case 'C':
                    temp = 100;
                    break;
                case 'L':
                    temp = 50;
                    break;
                case 'X':
                    temp = 10;
                    break;
                case 'V':
                    temp = 5;
                    break;
                case 'I':
                    temp = 1;
                    break;
            }
            if(temp2 < temp) {
                temp = temp - (2 * temp2);
            }
            temp2 = temp;
            sum = sum + temp;
        }
        return sum;
    }
}

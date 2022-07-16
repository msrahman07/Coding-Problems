class Solution {
    public int addDigits(int num) {
        // String number = ""+num;
        // while(number.length() != 1){
        //     number = ""+num;
        //     num = 0;
        //     for(int i=0; i<number.length(); i++){
        //         num += (number.charAt(i)-'0');
        //     }
        // }
        // return (int)number.charAt(0)-'0';
        // if (num == 0) return 0;
        // if (num % 9 == 0) return 9;
        // return num % 9;
        return num == 0 ? 0 : 1 + (num - 1) % 9;
    }
}

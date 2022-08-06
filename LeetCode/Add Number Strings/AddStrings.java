class Solution {
    public String addStrings(String num1, String num2) {
        // int val = (num1.charAt(2)-48)+(num2.charAt(2)-48);
//         String answer = "";
//         String carryOns = "0";
        
//         String longestNum = "";
//         String shortestNum = "";
        
//         if(num1.length() > num2.length()){
//             longestNum = num1;
//             shortestNum = num2;
//         }else{
//             longestNum = num2;
//             shortestNum = num1;
//         }
//         System.out.println(longestNum.length()-shortestNum.length());
//         int len = longestNum.length()-shortestNum.length();
//         for(int i = 0; i<len; i++){
//             shortestNum = "0"+shortestNum;
//         }
//         System.out.println(longestNum.length()-shortestNum.length());
        
//         int sum = 0;
//         for(int i=shortestNum.length()-1; i>=0; i--){
//             sum = (longestNum.charAt(i)-48)+(shortestNum.charAt(i)-48)+(carryOns.charAt(0)-48);
//             // if(shortestNum.length() == 1){
//             //     answer = sum + answer;
//             //     return answer;
//             // }
//             answer = sum%10 + answer;
//             if(sum>=10){
//                 carryOns = sum + carryOns;
//             }else{
//                 carryOns = "0";
//             }
//         }
//         if((carryOns.charAt(0)-48) != 0 ){
//             answer = carryOns.charAt(0)+answer;        
//         }
        
            
//         // System.out.println(val2);
//         return answer;
        int num1C = num1.length()-1;
        int num2C = num2.length()-1;
        int sum = 0;
        int carry = 0;
        StringBuilder sumStr = new StringBuilder();
        while(true){
            if(num1C >= 0 && num2C >=0){
                sum = num1.charAt(num1C)+num2.charAt(num2C)-96+carry;
            }else if(num1C >= 0){
                sum = num1.charAt(num1C)-48+carry;
            }else if(num2C >= 0){
                sum = num2.charAt(num2C)-48+carry;
            }else{
                break;
            }
                sumStr = sumStr.append((sum%10));
                carry = sum/10;
                sum = sum%10;
                num1C--;
                num2C--;
        }
        if(carry!=0){
            sumStr.append(carry);
        }
        return sumStr.reverse().toString();
    }
}

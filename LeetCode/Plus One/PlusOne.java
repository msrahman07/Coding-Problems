class Solution {
    public int[] plusOne(int[] digits) {
        int val = 0;
        int carryOn = 1;
        int[] temp = new int[digits.length+1];
        int tempIndex = temp.length-1;
        
        for(int i=digits.length-1; i>=0; i--){
            val = digits[i] + carryOn;
            if(val>9){
                val -= 10;
            }else{
                carryOn = 0;
            }
            temp[tempIndex] = val;
            digits[i] = val;
            tempIndex--;
        }
        
        if(carryOn != 0){
            temp[tempIndex] = carryOn;
            return temp;
        }
        
        return digits;
    }
}

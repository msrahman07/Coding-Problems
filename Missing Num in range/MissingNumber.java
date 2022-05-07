class MissingNumber {
    public int missingNumber(int[] nums) {
        int sum = 0;
        
        for(int num : nums){
            sum += num;
        }
        return nums.length*(nums.length+1)/2 - sum;
    //Binary
        // int range = 0;
        // for(int i=1; i<=nums.length; i++){
        //     range = range ^ i;
        // }
        // int numbers = 0;
        // for(int num : nums){
        //     numbers = numbers ^ num;
        // }
        // return range ^ numbers;
    }
}

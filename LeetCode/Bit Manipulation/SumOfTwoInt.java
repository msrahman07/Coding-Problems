class SumOfTwoInt {
    public int getSum(int a, int b) {
    	if(b==0){
            return a;
        } else{
            return getSum(a ^ b, (a & b) << 1);
        }
    }
}

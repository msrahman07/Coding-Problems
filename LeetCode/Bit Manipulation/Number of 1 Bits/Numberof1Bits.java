public class Numberof1Bits {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        
        // for(int i=0; i<32; i++){
        //     count += n & 1;
        //     n = n >> 1;
        // }
        while(n != 0){
            n = n & (n-1);
            count++;
        }
        return count;
    }
}

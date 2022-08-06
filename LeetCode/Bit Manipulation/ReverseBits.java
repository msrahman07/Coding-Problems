public class ReverseBits {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int toReturn = 0;
        
        for(int bitPos = 0; bitPos < 32; bitPos++) {
            int toReturnBitPos = 31 - bitPos;
            
            boolean thisBitOn = ((1 << bitPos) & n) != 0;
            
            if(thisBitOn) toReturn |= (1 << toReturnBitPos);
        }
        
        return toReturn;
    }
}

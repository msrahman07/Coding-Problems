import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import programming.problems.LargestNumber;

public class LargestNumberTests {
    @Test
    @DisplayName("[10,2] = 210")
    public void largestNumber210() {
        LargestNumber lgNum = new LargestNumber();
        int[] nums = {10, 2};
        Assertions.assertEquals("210", lgNum.largestNumber(nums));
    }

    @Test
    @DisplayName("[3,30,34,5,9] = 9534330")
    public void largestNumber9534330() {
        LargestNumber lgNum = new LargestNumber();
        int[] nums = {3,30,34,5,9};
        Assertions.assertEquals("9534330", lgNum.largestNumber(nums));
    }

    @Test
    @DisplayName("[0,0,0,0] = 0")
    public void largestNumber0() {
        LargestNumber lgNum = new LargestNumber();
        int[] nums = {0,0,0,0};
        Assertions.assertEquals("0", lgNum.largestNumber(nums));
    }

    @Test
    @DisplayName("[0,0,1,0] = 0")
    public void largestNumber1000() {
        LargestNumber lgNum = new LargestNumber();
        int[] nums = {0,0,1,0};
        Assertions.assertEquals("1000", lgNum.largestNumber(nums));
    }
}

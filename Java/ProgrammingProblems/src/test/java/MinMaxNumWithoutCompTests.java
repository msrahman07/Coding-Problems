import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import programming.problems.MinMaxNumWithoutComp;

public class MinMaxNumWithoutCompTests {
    @Test
    @DisplayName("Test minimum number")
    public void minNumberTest1() {
        MinMaxNumWithoutComp numWithoutComp = new MinMaxNumWithoutComp();
        Assertions.assertEquals(3, numWithoutComp.minNumber(9, 3));
    }
    @Test
    @DisplayName("Test minimum number")
    public void minNumberTest2() {
        MinMaxNumWithoutComp numWithoutComp = new MinMaxNumWithoutComp();
        Assertions.assertEquals(9, numWithoutComp.minNumber(9, 111));
    }
    @Test
    @DisplayName("Test maximum number")
    public void maxNumberTest1() {
        MinMaxNumWithoutComp numWithoutComp = new MinMaxNumWithoutComp();
        Assertions.assertEquals(3, numWithoutComp.maxNumber(-100, 3));
    }
    @Test
    @DisplayName("Test maximum number")
    public void maxNumberTest2() {
        MinMaxNumWithoutComp numWithoutComp = new MinMaxNumWithoutComp();
        Assertions.assertEquals(10, numWithoutComp.maxNumber(10, 0));
    }
    @Test
    @DisplayName("Test maximum number")
    public void maxNumberTest3() {
        MinMaxNumWithoutComp numWithoutComp = new MinMaxNumWithoutComp();
        Assertions.assertEquals(Integer.MAX_VALUE, numWithoutComp.maxNumber(Integer.MAX_VALUE, -3));
    }
}

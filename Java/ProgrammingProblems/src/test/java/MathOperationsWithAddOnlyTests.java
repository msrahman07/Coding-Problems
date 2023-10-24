import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import programming.problems.MathOperationsWithAddOnly;

public class MathOperationsWithAddOnlyTests {
    @Test
    @DisplayName("Test multiply Function, First number larger")
    public void multiplyTestFirstLarger() {
        MathOperationsWithAddOnly op = new MathOperationsWithAddOnly();
        Assertions.assertEquals(6, op.multiply(3, 2));
    }

    @Test
    @DisplayName("Test multiply Function, Second number larger")
    public void multiplyTestSecondLarger() {
        MathOperationsWithAddOnly op = new MathOperationsWithAddOnly();
        Assertions.assertEquals(66, op.multiply(6, 11));
    }

    @Test
    @DisplayName("Test multiply Function, One of them 0")
    public void multiplyTestZero() {
        MathOperationsWithAddOnly op = new MathOperationsWithAddOnly();
        Assertions.assertEquals(0, op.multiply(11, 0));
    }
    @Test
    @DisplayName("Test multiply Function, One of them Negative")
    public void multiplyTestNeg() {
        MathOperationsWithAddOnly op = new MathOperationsWithAddOnly();
        Assertions.assertEquals((11*-2), op.multiply(11, -2));
    }
}

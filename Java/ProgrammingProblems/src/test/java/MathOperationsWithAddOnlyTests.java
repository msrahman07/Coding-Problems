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
    @Test
    @DisplayName("Test multiply Function, One of them Negative")
    public void subtractTestPos() {
        MathOperationsWithAddOnly op = new MathOperationsWithAddOnly();
        Assertions.assertEquals((99-37), op.subtract(99, 37));
    }
    @Test
    @DisplayName("Test multiply Function, One of them Negative")
    public void subtractTestOneNeg() {
        MathOperationsWithAddOnly op = new MathOperationsWithAddOnly();
        Assertions.assertEquals((99-(-37)), op.subtract(99, -37));
    }
    @Test
    @DisplayName("Test multiply Function, One of them Negative")
    public void subtractTestBothNeg() {
        MathOperationsWithAddOnly op = new MathOperationsWithAddOnly();
        Assertions.assertEquals(((-99)-(-37)), op.subtract(-99, -37));
    }
    @Test
    @DisplayName("Test multiply Function, One of them Negative")
    public void subtractTestZero() {
        MathOperationsWithAddOnly op = new MathOperationsWithAddOnly();
        Assertions.assertEquals((-99), op.subtract(-99, 0));
    }
    @Test
    @DisplayName("Test multiply Function, One of them Negative")
    public void divideTestByZero() {
        MathOperationsWithAddOnly op = new MathOperationsWithAddOnly();
        ArithmeticException thrown = Assertions.assertThrows(ArithmeticException.class, () -> {
            op.divide(99, 0);
        }, "Divided by zero");
        Assertions.assertEquals("Divided by zero", thrown.getMessage());
    }
    @Test
    @DisplayName("Test multiply Function, One of them Negative")
    public void divideTest12By4() {
        MathOperationsWithAddOnly op = new MathOperationsWithAddOnly();
        Assertions.assertEquals(12/4, op.divide(12, 4));
    }

    @Test
    @DisplayName("Test multiply Function, One of them Negative")
    public void divideTest34By3() {
        MathOperationsWithAddOnly op = new MathOperationsWithAddOnly();
        Assertions.assertEquals(34/3, op.divide(34, 3));
    }
    @Test
    @DisplayName("Test multiply Function, One of them Negative")
    public void divideTest0By33() {
        MathOperationsWithAddOnly op = new MathOperationsWithAddOnly();
        Assertions.assertEquals(0/33, op.divide(0, 33));
    }
}

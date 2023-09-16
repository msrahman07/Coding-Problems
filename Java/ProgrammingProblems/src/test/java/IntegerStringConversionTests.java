import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import programming.problems.IntegerStringConversion;

public class IntegerStringConversionTests {
    @Test
    @DisplayName("Check all int numbers")
    public void stringToIntCheckAll() {
        IntegerStringConversion intStringCov = new IntegerStringConversion();
        int start = -1000000;

        while(start <= 1000000) {
            Assertions.assertEquals(start, intStringCov.stringToInt(""+start));
            start++;
        }
    }

    @Test
    @DisplayName("String is NOT a number")
    public void stringToIntNotANumber() {
        IntegerStringConversion intStringCov = new IntegerStringConversion();
        Assertions.assertThrows(NumberFormatException.class, ()-> intStringCov.stringToInt("asda"));
    }

    @Test
    @DisplayName("Check for empty string")
    public void stringToIntEmptyString() {
        IntegerStringConversion intStringCov = new IntegerStringConversion();
        Assertions.assertThrows(NumberFormatException.class, ()-> intStringCov.stringToInt(""));
    }

}

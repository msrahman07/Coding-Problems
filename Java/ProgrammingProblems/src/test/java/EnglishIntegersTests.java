import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import programming.problems.EnglishIntegers;

public class EnglishIntegersTests {
    @Test
    @DisplayName("Integer to words for 0")
    public void numberToWordsZero(){
        EnglishIntegers words = new EnglishIntegers();
        Assertions.assertEquals("Zero", words.numberToWords(0));
    }
    @Test
    @DisplayName("Integer to words for 0")
    public void numberToWords3(){
        EnglishIntegers words = new EnglishIntegers();
        Assertions.assertEquals("Three", words.numberToWords(3));
    }
    @Test
    @DisplayName("Integer to words for 0")
    public void numberToWords10(){
        EnglishIntegers words = new EnglishIntegers();
        Assertions.assertEquals("Ten", words.numberToWords(10));
    }
    @Test
    @DisplayName("Integer to words for 0")
    public void numberToWords17(){
        EnglishIntegers words = new EnglishIntegers();
        Assertions.assertEquals("Seventeen", words.numberToWords(17));
    }
    @Test
    @DisplayName("Integer to words for 0")
    public void numberToWords23(){
        EnglishIntegers words = new EnglishIntegers();
        Assertions.assertEquals("Twenty Three", words.numberToWords(23));
    }

    @Test
    @DisplayName("Integer to words for 0")
    public void numberToWords100(){
        EnglishIntegers words = new EnglishIntegers();
        Assertions.assertEquals("One Hundred", words.numberToWords(100));
    }

    @Test
    @DisplayName("Integer to words for 0")
    public void numberToWords177(){
        EnglishIntegers words = new EnglishIntegers();
        Assertions.assertEquals("One Hundred Seventy Seven", words.numberToWords(177));
    }
    @Test
    @DisplayName("Integer to words for 999")
    public void numberToWords999(){
        EnglishIntegers words = new EnglishIntegers();
        Assertions.assertEquals("Nine Hundred Ninety Nine", words.numberToWords(999));
    }
    @Test
    @DisplayName("Integer to words for 1000000")
    public void numberToWords1000000(){
        EnglishIntegers words = new EnglishIntegers();
        Assertions.assertEquals("One Million", words.numberToWords(1000000));
    }
}

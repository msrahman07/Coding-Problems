import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import programming.problems.FirstNonrepeatedCharacter;

public class FirstNonrepeatedCharacterTests {
    @Test
    @DisplayName("Check for nonrepeated character in total")
    public void findFirstNonrepeatedCharInTotal() {
        FirstNonrepeatedCharacter finder = new FirstNonrepeatedCharacter();
        String str = "total";
        char result = finder.findFirstNonrepeatedChar(str);
        Assertions.assertEquals('o', result);
    }

    @Test
    @DisplayName("Check for nonrepeated character in teeter")
    public void findFirstNonrepeatedCharInTeeter() {
        FirstNonrepeatedCharacter finder = new FirstNonrepeatedCharacter();
        String str = "teeter";
        char result = finder.findFirstNonrepeatedChar(str);
        Assertions.assertEquals('r', result);
    }

    @Test
    @DisplayName("Check for nonrepeated character in empty string")
    public void findFirstNonrepeatedCharInEmptyString() {
        FirstNonrepeatedCharacter finder = new FirstNonrepeatedCharacter();
        String str = "";
        Assertions.assertNull(finder.findFirstNonrepeatedChar(str));
    }

    @Test
    @DisplayName("Check for NO nonrepeated character")
    public void findFirstNonrepeatedCharNoNonrepeat() {
        FirstNonrepeatedCharacter finder = new FirstNonrepeatedCharacter();
        String str = "aaacccdddd";
        Assertions.assertNull(finder.findFirstNonrepeatedChar(str));
    }

    @Test
    @DisplayName("First letter should be non repeated")
    public void findFirstNonrepeatedCharFirstLetter() {
        FirstNonrepeatedCharacter finder = new FirstNonrepeatedCharacter();
        String str = "zaaacccdddd";
        Assertions.assertEquals('z', finder.findFirstNonrepeatedChar(str));
    }

    @Test
    @DisplayName("Last letter should be non repeated")
    public void findFirstNonrepeatedCharLastLetter() {
        FirstNonrepeatedCharacter finder = new FirstNonrepeatedCharacter();
        String str = "aaacccddddz";
        Assertions.assertEquals('z', finder.findFirstNonrepeatedChar(str));
    }

    @Test
    @DisplayName("Middle letter should be non repeated")
    public void findFirstNonrepeatedCharMiddleLetter() {
        FirstNonrepeatedCharacter finder = new FirstNonrepeatedCharacter();
        String str = "aaacczcdddd";
        Assertions.assertEquals('z', finder.findFirstNonrepeatedChar(str));
    }

    @Test
    @DisplayName("All non repeated character, should return first")
    public void findFirstNonrepeatedCharAllNonrepeated() {
        FirstNonrepeatedCharacter finder = new FirstNonrepeatedCharacter();
        String str = "plkjhgtres";
        Assertions.assertEquals('p', finder.findFirstNonrepeatedChar(str));
    }

    @Test
    @DisplayName("Large string, check efficiency")
    public void findFirstNonrepeatedCharLargeString() {
        FirstNonrepeatedCharacter finder = new FirstNonrepeatedCharacter();
        String str = "abcdefghijklmnopqrstuvwyzxabcdefghijklmnopqrstuvwyz" +
                "bcdefghijklmnopqrstuvwyzabcdefghijklmnopqrstuvwyzabcdefg" +
                "ijklmnopqrstuvwyzabcdefghijklmnopqrstuvwyzabcdefghijklmn" +
                "opqrstuvwyzabcdefghijklmnopqrstuvwyzabcdefghijklmnopqrst" +
                "uvwyzabcdefghijklmnopqrstuvwyzabcdefghijklmnopqrstuvwyz" +
                "abcdefghijklmnopqrstuvwyz\" +\n" +
                "                \"bcdefghijklmnopqrstuvwyzabcdefghijklmnopqrstuvwyzabcdefg\" +\n" +
                "                \"ijklmnopqrstuvwyzabcdefghijklmnopqrstuvwyzabcdefghijklmn\" +\n" +
                "                \"opqrstuvwyzabcdefghijklmnopqrstuvwyzabcdefghijklmnopqrst\" +\n" +
                "                \"uvwyzabcdefghijklmnopqrstuvwyzabcdefghijklmnopqrstuvwyz";
        Assertions.assertEquals('x', finder.findFirstNonrepeatedChar(str));
    }
}
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import programming.problems.RemoveSpecifiedCharacters;

public class RemoveSpecifiedCharactersTests {
    @Test
    @DisplayName("Default provided test case")
    public void removeChars() {
        RemoveSpecifiedCharacters rmvChars =  new RemoveSpecifiedCharacters();
        StringBuilder str = new StringBuilder("Battle of the Vowels: Hawaii vs. Grozny");
        String remove = "aeiou";
        StringBuilder expectedResult = new StringBuilder("Bttl f th Vwls: Hw vs. Grzny");
        rmvChars.removeChars(str, remove);
        Assertions.assertEquals(expectedResult.toString(), str.toString());
    }

    @Test
    @DisplayName("Remove only first character")
    public void removeCharsFirstChar() {
        RemoveSpecifiedCharacters rmvChars =  new RemoveSpecifiedCharacters();
        StringBuilder str = new StringBuilder("abc d efg hij klmn opqrstyouv wxyz");
        String remove = "a";
        StringBuilder expectedResult = new StringBuilder("bc d efg hij klmn opqrstyouv wxyz");
        rmvChars.removeChars(str, remove);
        Assertions.assertEquals(expectedResult.toString(), str.toString());
    }

    @Test
    @DisplayName("Remove only last character")
    public void removeCharsLastChar() {
        RemoveSpecifiedCharacters rmvChars =  new RemoveSpecifiedCharacters();
        StringBuilder str = new StringBuilder("abc d efg hij klmn opqrstyouv wxyz");
        String remove = "z";
        StringBuilder expectedResult = new StringBuilder("abc d efg hij klmn opqrstyouv wxy");
        rmvChars.removeChars(str, remove);
        Assertions.assertEquals(expectedResult.toString(), str.toString());
    }
    @Test
    @DisplayName("Remove full string")
    public void removeCharsFullString() {
        RemoveSpecifiedCharacters rmvChars =  new RemoveSpecifiedCharacters();
        StringBuilder str = new StringBuilder("abc d efg hij klmn opqrstyouv wxyz");
        String remove = "abc d efg hij klmn opqrstyouv wxyz";
        StringBuilder expectedResult = new StringBuilder("");
        rmvChars.removeChars(str, remove);
        Assertions.assertEquals(expectedResult.toString(), str.toString());
    }
    @Test
    @DisplayName("Remove spaces")
    public void removeCharsSpaces() {
        RemoveSpecifiedCharacters rmvChars =  new RemoveSpecifiedCharacters();
        StringBuilder str = new StringBuilder("abc d efg hij klmn opqrstyouv wxyz");
        String remove = " ";
        StringBuilder expectedResult = new StringBuilder("abcdefghijklmnopqrstyouvwxyz");
        rmvChars.removeChars(str, remove);
        Assertions.assertEquals(expectedResult.toString(), str.toString());
    }

    @Test
    @DisplayName("Check length of string is right")
    public void removeCharsCheckForLength() {
        RemoveSpecifiedCharacters rmvChars =  new RemoveSpecifiedCharacters();
        StringBuilder str = new StringBuilder("abc d efg hij klmn opqrstyouv wxyz");
        String remove = " xyz";
        StringBuilder expectedResult = new StringBuilder("abcdefghijklmnopqrstouvw");
        rmvChars.removeChars(str, remove);
        Assertions.assertEquals(expectedResult.toString().length(), str.toString().length());
    }

    @Test
    @DisplayName("Try to remove characters not in main string")
    public void removeCharsCheckNotInString() {
        RemoveSpecifiedCharacters rmvChars =  new RemoveSpecifiedCharacters();
        StringBuilder str = new StringBuilder("efg hij klmn opqrstyouv wxyz");
        String remove = "abcd";
        StringBuilder expectedResult = new StringBuilder("efg hij klmn opqrstyouv wxyz");
        rmvChars.removeChars(str, remove);
        Assertions.assertEquals(expectedResult.toString(), str.toString());
    }

    @Test
    @DisplayName("Try to remove characters from empty string")
    public void removeCharsCheckEmptyString() {
        RemoveSpecifiedCharacters rmvChars =  new RemoveSpecifiedCharacters();
        StringBuilder str = new StringBuilder();
        String remove = "abcd";
        StringBuilder expectedResult = new StringBuilder();
        rmvChars.removeChars(str, remove);
        Assertions.assertEquals(expectedResult.toString(), str.toString());
    }
}


import org.example.Basics;
import org.example.Mocking;
import org.example.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class BasicsTests {
    @Test
    @DisplayName("First number is greater that the second")
    public void compare() {
        Basics basicTests = new Basics();
        int value = basicTests.compare(2,1);

        Assertions.assertEquals(1, value);
    }

    @Test
    @DisplayName("First number is less than the second")
    public void compare2() {
        Basics basicTests = new Basics();
        int value = basicTests.compare(2, 3);
        Assertions.assertEquals(-1, value);
    }

    @Test
    @DisplayName("First number is equal to the second")
    public void compare3() {
        Basics basicTests = new Basics();
        int value = basicTests.compare(2, 2);
        Assertions.assertEquals(0, value);
    }

    @Test
    @DisplayName("Array sorted")
    public void sortArray() {
        Basics basicTests = new Basics();
        int[] array = {5, 8, 3, 9, 1, 6};
        basicTests.sortArray(array);
        Assertions.assertArrayEquals(new int[]{1, 3, 5, 6, 8, 9}, array);
    }
}

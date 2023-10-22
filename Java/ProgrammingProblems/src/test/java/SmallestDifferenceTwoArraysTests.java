import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import programming.problems.SmallestDifferenceTwoArrays;

public class SmallestDifferenceTwoArraysTests {
    @Test
    @DisplayName("Example test 1")
    public void smallestDifferenceEx1() {
        SmallestDifferenceTwoArrays sd = new SmallestDifferenceTwoArrays();
        int[] arr1 = {1, 3, 15, 11, 2},
            arr2 = {23, 127, 235, 19, 8};
        Assertions.assertEquals(3, sd.smallestDifference(arr1, arr2));
    }

    @Test
    @DisplayName("Example test 2")
    public void smallestDifferenceEx2() {
        SmallestDifferenceTwoArrays sd = new SmallestDifferenceTwoArrays();
        int[] arr1 = {1, 3, 15, 19, 23},
                arr2 = {23, 127, 235, 19, 20, 23, 127, 235, 19, 20};
        Assertions.assertEquals(0, sd.smallestDifference(arr1, arr2));
    }
}

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import programming.problems.BinarySearch;

public class BinarySearchTests {
    @Test
    @DisplayName("Search first item")
    public void searchFirstItem() {
        BinarySearch bs = new BinarySearch();
        int[] nums = {2, 5, 7, 11, 15, 22, 99};
        int target = 2;
        int expectedIndex = 0;

        Assertions.assertEquals(expectedIndex, bs.search(nums, target));
    }

    @Test
    @DisplayName("Search last item")
    public void searchLastItem() {
        BinarySearch bs = new BinarySearch();
        int[] nums = {2, 5, 7, 11, 15, 22, 99};
        int target = 99;
        int expectedIndex = nums.length-1;

        Assertions.assertEquals(expectedIndex, bs.search(nums, target));
    }

    @Test
    @DisplayName("Search only item")
    public void searchOnlyItem() {
        BinarySearch bs = new BinarySearch();
        int[] nums = {2};
        int target = 2;
        int expectedIndex = 0;

        Assertions.assertEquals(expectedIndex, bs.search(nums, target));
    }

    @Test
    @DisplayName("Target doesn't exist")
    public void searchMissingTarget() {
        BinarySearch bs = new BinarySearch();
        int[] nums = {2, 5, 7, 11, 15, 22, 99};
        int target = 101;
        int expectedIndex = -1;

        Assertions.assertEquals(expectedIndex, bs.search(nums, target));
    }

    @Test
    @DisplayName("Search middle number")
    public void searchMiddleTarget() {
        BinarySearch bs = new BinarySearch();
        int[] nums = {2, 5, 7, 11, 15, 22, 99};
        int target = 11;
        int expectedIndex = 3;

        Assertions.assertEquals(expectedIndex, bs.search(nums, target));
    }
}

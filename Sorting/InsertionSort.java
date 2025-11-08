
import java.util.Arrays;

public class InsertionSort {
    public static void main(String args[]) {
        int[] nums = { 2, 5, 4, 1, 9, 7, 8 };
        insertionSort(nums);
        System.out.println(Arrays.toString(nums));

    }
    // You pick one element at a time and insert it into its correct position within
    // the sorted portion on the left side.

    public static void insertionSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                // Starts from the current element i + 1 and moves backward.
                // It compares the current element with the one before it.
                if (nums[j - 1] > nums[j]) {
                    int t = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = t;
                } else {
                    break;

                }
            }
        }
    }

}

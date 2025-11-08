
import java.util.Arrays;

public class BubbleSort {
    public static void main(String args[]) {
        int[] nums = { 12, 11, 19, 13, 15, 16, 9, 2 };
        boolean b = bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println("boolean sorted: " + b);

    }

    // for sorted array no swap will be executed therfore we are going to add an
    // boolean value to check
    public static boolean bubbleSort(int[] nums) {
        boolean swapped = true;
        for (int i = 0; i < nums.length; i++) {
            // for each end of for loop the max element will be at end
            for (int j = 1; j < nums.length - i; j++) {
                // for loop used to compare element with its adjacent elements
                if (nums[j - 1] > nums[j]) {
                    int t = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = t;
                    swapped = false;
                }

            }
        }
        return swapped;
    }

}

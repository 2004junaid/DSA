package Arrays.easy;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String args[]) {
        int[] nums = { 0, 1, 0, 3, 12 };
        moveZeroes(nums);

    }

    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int[] temp = new int[n];
        int j = 0;
        // storing non-zero in temp
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                temp[j] = nums[i];
                j++;
            }
        }
        // reallocating all non-zero back to nums
        for (int i = 0; i < temp.length; i++) {
            nums[i] = temp[i];

        }
        // assigning remaining nums value to zero
        for (int i = temp.length; i < nums.length; i++) {
            nums[i] = 0;
        }
        System.out.println("The Array is" + Arrays.toString(nums));
    }
}

package Arrays.medium;

import java.util.Arrays;

public class RearrangeArray {
    public static void main(String args[]) {
        int[] nums = { 3, 1, -2, -5, 2, -4 };
        System.out.println(Arrays.toString(rearrangeArray(nums)));
    }

    public static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] pos = new int[n];
        int[] neg = new int[n];
        int posIndex = 0;
        int negIndex = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                pos[posIndex++] = nums[i];
            } else {
                neg[negIndex++] = nums[i];
            }
        }
        for (int i = 0; i < n / 2; i++) {
            nums[2 * i] = pos[i];
            nums[2 * i + 1] = neg[i];
        }
        return nums;
    }

}

package Searching;

public class SquareRootSearch {
    public static void main(String args[]) {
        int[] nums = { 1, 3, 4, 6, 8, 9, 12 };
        int n = 121;
        System.out.println(SquareRoot(nums, n));
    }

    public static int SquareRoot(int nums[], int n) {
        int ans = -1;
        for (int i = 0; i < n; i++) {
            if (nums[i] * nums[i] <= n) {
                // the floor root of the number n
                ans = nums[i];
            } else {
                break;
            }
        }
        return ans;
    }

}

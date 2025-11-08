package Searching;

public class RotatedSortedArrayII {
    public static void main(String args[]) {
        int nums[] = { 2, 3, 5, 6, 0, 0, 1, 2, };
        int target = 3;
        System.out.println(search(nums, target));

    }

    public static boolean search(int[] nums, int target) {
        // if duplicates are there then more optimal solution can be obtained by "Linear
        // Search".
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == target) {
                return true;
            }
        }
        return false;
    }
}

package Searching;

public class FloorCeiling {

    public static void main(String args[]) {
        int[] nums = { 1, 4, 5, 6, 8, 9 };
        int n = 3;
        System.out.println("Floor " + findFloor(nums, n));
        System.out.println("Ceiling " + findCeil(nums, n));
    }

    public static int findFloor(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        int floor = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return nums[mid]; // exact match is floor too
            } else if (nums[mid] < target) {
                floor = nums[mid]; // potential floor only extra line to binary search
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return floor;
    }

    public static int findCeil(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        int ceil = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return nums[mid]; // exact match is ceil too
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                ceil = nums[mid]; // potential ceil only extra line to binary search
                end = mid - 1;
            }
        }

        return ceil;
    }

}

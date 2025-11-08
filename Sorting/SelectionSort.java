
public class SelectionSort {
    public static void main(String args[]) {
        int[] nums = { 23, 1, 43, 12, 14, 11, 15 };
        selectionSort(nums);

    }

    public static void selectionSort(int[] nums) {

        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            // This loop looks through the rest of the array to find the smallest value and
            // its index (min).
            for (int j = i; j < n; j++) {
                if (nums[j] < nums[min]) {
                    min = j;
                }
            }
            int t = nums[i];
            nums[i] = nums[min];
            nums[min] = t;
        }
        for (int i : nums) {
            System.out.println(i);
        }
    }

}

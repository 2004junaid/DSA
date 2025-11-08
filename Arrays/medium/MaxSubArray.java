package Arrays.medium;

public class MaxSubArray {
    public static void main(String args[]) {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        // kadane's algorithm
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            max = Math.max(max, sum);
            if (sum < 0) { // taking negative value will not benefits us since it will reduce the sum but
                           // we want max
                sum = 0;
            }
        }
        return max;
    }

}

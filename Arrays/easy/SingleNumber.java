package Arrays.easy;

public class SingleNumber {
    public static void main(String args[]) {
        int[] nums = { 1, 1, 2, 3, 3, 4, 4 };
        System.out.println(singleNumber(nums));

    }

    public static int singleNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum ^ nums[i];
        }
        return sum;
    }

}

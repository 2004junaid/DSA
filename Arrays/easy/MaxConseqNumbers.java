package Arrays.easy;

public class MaxConseqNumbers {
    public static void main(String args[]) {
        int[] nums = { 1, 1, 0, 0, 1, 1, 1, 0, 1, 1 };
        System.out.println(findMaxConsecutiveOnes(nums));

    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int maximum = 0;
        int count = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                count++; // if number equal to one then count increased for consequetive
                maximum = Math.max(maximum, count);// check the count of conseq with the previous conseq
            } else {
                count = 0;// if zero appears then break then start counter fo 1 from zer0

            }
        }
        return maximum;
    }

}

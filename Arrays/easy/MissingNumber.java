package Arrays.easy;

public class MissingNumber {
    public static void main(String args[]) {
        int[] nums = { 0, 1, 3, 2, 5 };
        int missNum = missingNumber(nums);
        System.out.println(missNum);
    }

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int totalSum = n * (n + 1) / 2; // for the total sum if number was not missing
        int currSum = 0;
        for (int i = 0; i < n; i++) {
            currSum += nums[i]; // sum of the array

        }
        return (totalSum - currSum); // gets the missing number

    }
}

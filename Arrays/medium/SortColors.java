package Arrays.medium;

import java.util.Arrays;

//Medium level 
public class SortColors {
    public static void main(String args[]) {
        int[] nums = { 1, 1, 0, 0, 2, 1, 2 };
        sortColors(nums);

    }

    public static void sortColors(int[] nums) {
        // counting the number of 0s 1s and 2s and then overriding them
        int c0 = 0, c1 = 0, c2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                c0++;
            else if (nums[i] == 1)
                c1++;
            else if (nums[i] == 2)
                c2++;
        }
        // now overridin the array
        for (int i = 0; i < c0; i++)
            nums[i] = 0;
        for (int i = c0; i < c0 + c1; i++)
            nums[i] = 1;
        for (int i = c0 + c1; i < nums.length; i++)
            nums[i] = 2;

        System.out.println(Arrays.toString(nums));
    }
}

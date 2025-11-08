package Arrays.medium;

import java.util.*;

public class MaxCosecutiveElement {
    public static void main(String args[]) {
        int[] nums = { 100, 4, 200, 1, 3, 2 };
        System.out.println("The Max Consecutive array is: " + checkMaxConsecutive(nums));

    }

    public static int checkMaxConsecutive(int[] arr) {
        int longest = 1;
        int n = arr.length;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }

        for (int i : set) {
            if (!set.contains(i - 1)) { // if there exist a an element less than the i then there is no point in
                                        // checking.
                int cnt = 1;
                int x = i;
                while (set.contains(x + 1)) { // checking for next element and updating the cnt.
                    cnt = cnt + 1;
                    x = x + 1;
                }
                longest = Math.max(longest, cnt);
            }
        }

        return longest;
    }
}

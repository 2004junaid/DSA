package Arrays.easy;

import java.util.HashMap;

public class MajorityElement {
    public static void main(String args[]) {
        int[] nums = { 3, 2, 3 };
        System.out.println(majorityElement(nums));

    }

    public static int majorityElement(int[] nums) {
        // using hashing
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i : nums) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1); // putting the element with the count value in hash
            } else { // first occurence of the i th element
                map.put(i, 1);
            }
        }
        // check majority
        for (int i : nums) {
            if (map.get(i) > n / 2)
                return i;

        }
        return -1;
    }
}

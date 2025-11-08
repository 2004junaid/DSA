package Arrays.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionArray {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4 };
        int[] arr2 = { 3, 4, 5, 6 };
        System.out.println("Union of the arrays: " + Arrays.toString(findUnion(arr1, arr2)));
    }

    public static int[] findUnion(int[] arr1, int[] arr2) {
        // we can also use TreeSet if we want an SortedSet
        // since HashSet(default) doesnot take duplicates
        Set<Integer> set = new HashSet<>();

        // Add all elements from arr1
        for (int num : arr1) {
            set.add(num);
        }

        // Add all elements from arr2
        for (int num : arr2) {
            set.add(num);
        }

        // Convert set to array
        int[] union = new int[set.size()];
        int i = 0;
        for (int num : set) {
            union[i++] = num;
        }

        return union;
    }

}

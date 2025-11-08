package Reccursion;

import java.util.ArrayList;

//searching in the array and copying the indices of the target element found in arr into ArrayList
// Arraylist will print the indices
public class SearchArray {
    public static void main(String args[]) {
        int[] arr = { 1, 3, 4, 2, 10, 3, 14 };
        ArrayList<Integer> ans = findIndex(arr, 3, 0, new ArrayList<>());
        System.out.println(ans);

    }

    public static ArrayList<Integer> findIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findIndex(arr, target, index + 1, list);

    }
}

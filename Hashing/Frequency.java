package Hashing;

import java.util.*;

public class Frequency {
    public static void main(String args[]) {
        int[] arr = { 1, 2, 1, 3, 5, 2, 3, 1, 1, 2, 4, 5, 5, 6 };
        int n = arr.length;
        frequency(arr, n);
    }

    public static void frequency(int[] arr, int n) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);

            } else {
                map.put(arr[i], 1); // if the key is not present yet.

            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

}

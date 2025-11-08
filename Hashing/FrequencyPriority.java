package Hashing;

import java.util.HashMap;
import java.util.Map;

public class FrequencyPriority {
    public static void main(String args[]) {
        int[] arr = { 1, 2, 1, 3, 5, 2, 3, 1, 1, 2, 4, 5, 4, 6 };
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

        // getting the highest and lowest frequency.
        int maxFreq = 0, minFreq = n;
        int maxEle = 0, minEle = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int count = entry.getValue();
            int element = entry.getKey();

            if (count > maxFreq) {
                maxEle = element;
                maxFreq = count;
            }

            if (count < minFreq) {
                minEle = element;
                minFreq = count;
            }

        }
        System.out.println("The maximum frequency element is : " + maxEle);
        System.out.println("The minimum frequency element is : " + minEle);
    }

}

package Searching.BinarySearchOnAnswers;

import java.util.Arrays;

public class KokoPiles {
    public static int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = Arrays.stream(piles).max().getAsInt(); // max bananas in any pile
        int ans = high; // worst case eat the biggest pile in an hour
        while (low <= high) {
            int mid = (low + high) / 2;
            // Calculate total hours Koko would take to eat all piles at the current speed
            // 'mid'
            long totalHours = eatingRate(piles, mid);
            if (totalHours <= h) {
                ans = mid;
                high = mid - 1;// try smaller speed
            } else {
                low = mid + 1;// need to eat faster
            }
        }
        return ans;
    }

    public static long eatingRate(int[] piles, int hour) {
        int n = piles.length;
        long totalHours = 0;
        for (int i = 0; i <= n - 1; i++) {
            totalHours += (piles[i] + hour - 1) / hour; // integer ceiling
        }
        return totalHours;
    }

    public static void main(String[] args) {
        int[] piles = { 3, 6, 7, 11 };
        int h = 8;
        System.out.println(minEatingSpeed(piles, h)); // Expected: 4
    }
}

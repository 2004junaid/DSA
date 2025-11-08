package Arrays.easy;

import java.util.Arrays;

public class Element {
    public static void main(String args[]) {
        int arr[] = { 2, 5, 4, 1, 6, 7, 3 };
        largestElement(arr);
        secondLargest(arr);

    }

    public static void largestElement(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }
        }
        System.out.println("Largest element in array is " + max);
    }

    public static void secondLargest(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int largest = arr[n - 1];
        int secondLar = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < largest) {
                secondLar = arr[i];
                break;
            }

        }
        System.out.println("Second largest element in array is " + secondLar);
    }
}
package Reccursion;

import java.util.Scanner;

public class ReverseArray {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 5;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        revArray(0, arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void revArray(int i, int[] arr, int n) {
        // This if condition is used to traverse in the array till mid way.
        // since we are traversing from both start and end of the array
        if (i >= n / 2)
            return;
        int temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = temp;
        revArray(i + 1, arr, n);
    }

}

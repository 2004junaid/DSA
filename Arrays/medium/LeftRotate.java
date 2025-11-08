package Arrays.medium;

import java.util.Arrays;

public class LeftRotate {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int n = arr.length;
        int d = 3;// shifting number
        System.out.println("The rotated array is" + Arrays.toString(leftRotate(arr, n, d)));

    }

    public static int[] leftRotate(int[] arr, int n, int d) {
        d = d % n;
        int temp[] = new int[d];
        // storing d(shift numbers to temp array)
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        // adding the the remainning elements in arr from 0th index
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];

        }
        // pasting the rest of the elements at the end from temp to arr
        for (int i = n - d; i < n; i++) {
            arr[i] = temp[i - (n - d)];
        }
        return arr;
    }

}

package Reccursion;

import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = 5;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(palinCheck(0, arr, n));

    }

    public static boolean palinCheck(int i, int[] arr, int n) {
        if (i >= n / 2)
            return true;
        if (arr[i] != arr[n - i - 1])
            return false;

        return palinCheck(i + 1, arr, n);
    }

}

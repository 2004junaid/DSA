package Reccursion;

import java.util.Scanner;

public class Recc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 1;
        /*
         * System.out.println("1 to N");
         * print1ToN(count, n);
         * 
         * System.out.println("N to 1");
         * printNTo1(n);
         * 
         * System.out.println("The Sum of n numbers is :");
         * System.out.println(recSum(count, n));
         * 
         * System.out.println("The Factorial of the numbers is :");
         * System.out.println(factNum(n));
         * 
         * System.out.println("The Factorial/product of digits ");
         * System.out.println(prodDigits(n));
         */
        System.out.println("The number of zeros");
        System.out.println(countZeros(n));

    }

    public static void print1ToN(int count, int n) {

        if (count <= n) {
            System.out.println(count);
            count++;
            print1ToN(count, n);
        }
    }

    public static void printNTo1(int n) {
        if (n >= 1) {
            System.out.println(n);
            n--;
            printNTo1(n);

        }
    }

    public static int recSum(int count, int n) {
        if (count > n) {
            return 0; // base case
        }
        return count + recSum(count + 1, n); // recursive call with addition
    }

    public static int factNum(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factNum(n - 1);
    }

    public static int prodDigits(int n) {
        if (n % 10 == n) {
            return n;
        }
        // remainder * remaining digits
        return (n % 10) * prodDigits(n / 10);
    }

    public static int countZeros(int n) {
        int count = 0;
        return helper(n, count);

    }

    // helper function for count
    public static int helper(int n, int count) {
        if (n == 0) {
            return count;
        }
        int rem = n % 10;
        if (rem == 0) {
            return helper(n / 10, count + 1);
        }
        return helper(n / 10, count);
    }
}

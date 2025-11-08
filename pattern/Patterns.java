import java.util.Scanner;

public class Patterns {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = in.nextInt();
        // triangle(n);
        // triangleNumber(n);
        // triangleSameNumber(n);
        triangleDecreasing(n);
    }

    public static void triangle(int n) {
        // Print a right-angled triangle pattern
        // with n rows, where each row contains asterisks
        // equal to the row number.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    public static void triangleNumber(int n) {
        /*
         * 1
         * 12
         * 123
         * 1234
         * 12345
         */
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();

        }
    }

    public static void triangleSameNumber(int n) {
        /*
         * 1
         * 22
         * 333
         * 4444
         * 55555
         */
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();

        }
    }

    public static void triangleDecreasing(int n) {
        /*
         * 11111
         * 2222
         * 333
         * 44
         * 5
         */
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(i);
            }
            System.out.println();

        }
    }
}

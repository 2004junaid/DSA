package BasicMath;

public class CountDigits {
    public static void main(String args[]) {
        // Count the number of digits in a number
        // using a while loop.
        int n = 123456789;
        int count = 0;

        while (n != 0) {
            n /= 10; // Remove the last digit
            count++; // Increment the count
        }

        System.out.println("Number of digits: " + count);

    }

}

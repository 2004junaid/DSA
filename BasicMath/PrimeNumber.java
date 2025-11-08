package BasicMath;

public class PrimeNumber {
    public static void main(String args[]) {
        int count = 0;
        int n = 15;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;

            }
        }
        if (count == 2) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime number");
        }
    }

}

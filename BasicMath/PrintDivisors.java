package BasicMath;

public class PrintDivisors {
    public static void main(String[] args) {
        int n = 36;
        for (int x = 1; x <= n; x++) {
            if (n % x == 0) {
                System.out.println(x);
            }
        }

    }
}

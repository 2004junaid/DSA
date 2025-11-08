package BasicMath;

public class Gcd {
    public static void main(String[] args) {
        int gcd = 1;
        int n1 = 12;
        int n2 = 18;
        for (int i = 1; i <= n1; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                // both number are divisible and gcd is updated once a greater number divides
                // both the numbers

                gcd = i;
            }
        }
        System.out.println(gcd);
    }

}

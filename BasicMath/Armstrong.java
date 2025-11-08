package BasicMath;

public class Armstrong {
    public static void main(String args[]) {
        int number = 35;
        boolean result = isArmstrong(number);
        System.out.println(result);

    }

    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        while (number > 0) {
            int ld = number % 10;
            sum = sum + (ld * ld * ld);
            number /= 10;

        }
        if (sum == originalNumber) {
            return true;
        } else {
            return false;
        }
    }
}

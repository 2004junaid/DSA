package Strings;

public class LargestOdd {
    public static void main(String args[]) {
        String num = "1456";
        System.out.println(largestOddNumber(num));
        System.out.println(largestOddNumber2(num));
    }

    public static String largestOddNumber(String num) {
        StringBuilder sb = new StringBuilder(num);
        for (int i = num.length() - 1; i >= 0; i--) {
            if ((num.charAt(i) & 1) == 1) { // & 1 because odd numbers binary value ends up with 1 so giving 1
                return num.substring(0, i + 1); // if 1 == 1 then taking the entire substring from index 0 to i+1

            }
        }
        return "";
    }

    // other approach by slicing the digits and check if its odd
    public static String largestOddNumber2(String num) {
        StringBuilder sb = new StringBuilder(num); 
        for (int i = num.length() - 1; i >= 0; i--) {
            int digit = num.charAt(i) - '0'; // Convert char to int
            if (digit % 2 != 0) { // Check if digit is odd
                return num.substring(0, i + 1);
            }
        }
        return "";
    }

}

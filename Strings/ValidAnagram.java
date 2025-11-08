package Strings;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String args[]) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));

    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false; // if length is not equal then not a anagram
        char[] ch1 = s.toCharArray(); // changing the string into char array
        char[] ch2 = t.toCharArray();

        Arrays.sort(ch1); // sortin both the char arrays
        Arrays.sort(ch2);

        return Arrays.equals(ch1, ch2); // comparing both the arrays are equal or not
    }
}

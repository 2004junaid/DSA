package Strings;

public class CountNumberOfSubstrings {
    public static void main(String args[]) {
        String s = "Hello Man how are you";
        System.out.println(numberOfSubstrings(s));
    }

    public static int numberOfSubstrings(String s) {
        String[] str = s.split(" ");
        return str.length;
    }
}

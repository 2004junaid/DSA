package Strings;

public class ReverseWords {
    public static void main(String[] args) {
        String s = " Hello World ";
        System.out.println(reverseWords(s));

    }

    public static String reverseWords(String s) {
        String[] str = s.trim().split("\\s+"); // \s matches any whitespace character, including:
                                               // \ remove any backlash from the string

        String ans = "";

        for (int i = str.length - 1; i > 0; i--) {
            ans += str[i] + " ";
        }

        return ans + str[0];

    }

}

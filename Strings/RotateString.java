package Strings;

public class RotateString {
    // Given two strings s and goal, return true if and only if s can become goal
    // after some number of shifts on s.
    // A shift on s consists of moving the leftmost character of s to the rightmost
    // position.
    // For example, if s = "abcde", then it will be "bcdea" after one shift.
    public static void main(String args[]) {
        String s = "abcde";
        String goal = "cdeab";
        System.out.println(rotateString(s, goal));
    }

    public static boolean rotateString(String s, String goal) {
        // constraint:only left rotations allowed
        // we can append string s with its own string then check the substring of goal
        // in string

        if (s.length() != goal.length())
            return false; // checking it length of both the strings
        StringBuffer sb = new StringBuffer(s);

        sb.append(s); // for example abcde to abcdeabcde

        if (sb.toString().contains(goal)) { // checking if the goal is present in the sb
            return true;
        }
        return false;
    }

}

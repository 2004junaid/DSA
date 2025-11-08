package Strings;

public class MaxNestingDepth {
    public static void main(String args[]) {
        String s = "(1+(2*3)+((8)/4))+1";
        System.out.println(maxDepth(s));
    }

    public static int maxDepth(String s) {
        int maxdepth = 0;// max depth
        int curr = 0;// current depth
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                curr++;// if '(' then increment the counter
                maxdepth = Math.max(maxdepth, curr);// update the max
            } else if (ch == ')') {
                curr--;// if ')' then reduce the counter
            }
        }
        return maxdepth;
    }
}

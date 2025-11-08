package Strings;

public class OuterParenthesis {
    public static void main(String args[]) {
        String s = "(()())(())";
        System.out.println(removeOuterParentheses(s));
    }

    public static String removeOuterParentheses(String s) {
        int cnt = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                cnt--;

            }
            if (cnt != 0) { // if 0 then its an outer parenthesis not to be included. and the if the cnt is
                            // 2 then it means inner.
                sb.append(s.charAt(i));
            }

            // this condition is considered later to avoid taking outer openning parenthesis
            if (s.charAt(i) == '(') {
                cnt++;
            }
        }
        return sb.toString();
    }
}

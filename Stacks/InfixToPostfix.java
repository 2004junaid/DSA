package Stacks;

import java.util.*;

class infixToPostfix {

    // A utility function to return
    // precedence of a given operator
    // Higher returned value means
    // higher precedence
    static int Prec(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }
        return -1;
    }

    public static String infixToPostfix(String s) {
        // Your code goes here
        Stack<Character> st = new Stack<>();
        String result = new String("");

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                result += ch;
            } else if (ch == '(') {
                st.push(ch);
            } else if (ch == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    result += st.pop();
                }
                st.pop();
            } else {
                while (!st.isEmpty() && Prec(ch) <= Prec(st.peek())) {
                    result += st.pop();
                }
                st.push(ch);
            }
        }
        while (!st.isEmpty()) {
            result += st.pop();
        }
        return result;
    }

    public static void main(String args[]) {
        String exp = "a+b*c";
        System.out.println("Infix expression: " + exp);
        System.out.println("Prefix expression: " + infixToPostfix(exp));
    }

}
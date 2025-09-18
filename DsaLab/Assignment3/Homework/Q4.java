package Homework;

public class Q4 {
    static int precedence(char c) {
        if (c == '+' || c == '-') return 1;
        if (c == '*' || c == '/') return 2;
        if (c == '^') return 3;
        return -1;
    }

    static String infixToPostfix(String exp) {
        char[] stack = new char[exp.length()];
        int top = -1;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            } else if (c == '(') {
                stack[++top] = c;
            } else if (c == ')') {
                while (top != -1 && stack[top] != '(') {
                    result.append(stack[top--]);
                }
                if (top != -1 && stack[top] == '(') top--;
            } else {
                while (top != -1 && precedence(stack[top]) >= precedence(c)) {
                    result.append(stack[top--]);
                }
                stack[++top] = c;
            }
        }
        while (top != -1) {
            result.append(stack[top--]);
        }
        return result.toString();
    }
}

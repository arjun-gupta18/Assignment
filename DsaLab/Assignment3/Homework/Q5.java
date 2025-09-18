package Homework;

public class Q5 {
    static int evaluatePostfix(String exp) {
        int[] stack = new int[exp.length()];
        int top = -1;

        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);

            if (Character.isDigit(c)) {
                stack[++top] = c - '0';
            } else {
                int val2 = stack[top--];
                int val1 = stack[top--];
                switch (c) {
                    case '+': stack[++top] = val1 + val2; break;
                    case '-': stack[++top] = val1 - val2; break;
                    case '*': stack[++top] = val1 * val2; break;
                    case '/': stack[++top] = val1 / val2; break;
                }
            }
        }
        return stack[top];
    }
}

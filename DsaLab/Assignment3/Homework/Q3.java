package Homework;

public class Q3 {
    static boolean isBalanced(String exp) {
        char[] stack = new char[exp.length()];
        int top = -1;
        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack[++top] = c;
            } else if (c == ')' || c == '}' || c == ']') {
                if (top == -1) return false;
                char ch = stack[top--];
                if ((c == ')' && ch != '(') || 
                    (c == '}' && ch != '{') || 
                    (c == ']' && ch != '[')) return false;
            }
        }
        return top == -1;
    }
}

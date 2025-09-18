package AdditionalQues;

public class Q2 {
    static class MinStack {
        int[] stack;
        int top;
        int min;

        MinStack(int size) {
            stack = new int[size];
            top = -1;
            min = Integer.MAX_VALUE;
        }

        void push(int x) {
            if (top == -1) {
                stack[++top] = x;
                min = x;
            } else if (x >= min) {
                stack[++top] = x;
            } else {
                stack[++top] = 2 * x - min;
                min = x;
            }
        }

        void pop() {
            if (top == -1) return;
            int t = stack[top--];
            if (t < min) {
                min = 2 * min - t;
            }
        }

        int top() {
            int t = stack[top];
            if (t >= min) return t;
            else return min;
        }

        int getMin() {
            return min;
        }
    }
}

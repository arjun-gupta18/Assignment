package AdditionalQues;

public class Q3 {
    static void nextGreater(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        int[] stack = new int[n];
        int top = -1;

        for (int i = n - 1; i >= 0; i--) {
            while (top != -1 && stack[top] <= arr[i]) {
                top--;
            }
            if (top == -1) res[i] = -1;
            else res[i] = stack[top];
            stack[++top] = arr[i];
        }

        for (int x : res) {
            System.out.print(x + " ");
        }
    }
}

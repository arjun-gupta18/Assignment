package AdditionalQues;

public class Q1 {
     static void nearestSmaller(int[] arr) {
        int n = arr.length;
        int[] stack = new int[n];
        int top = -1;

        for (int i = 0; i < n; i++) {
            while (top != -1 && stack[top] >= arr[i]) {
                top--;
            }
            if (top == -1) {
                System.out.print("-1 ");
            } else {
                System.out.print(stack[top] + " ");
            }
            stack[++top] = arr[i];
        }
    }
}

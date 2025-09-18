package AdditionalQues;

public class Q4 {
    static int[] dailyTemperatures(int[] temp) {
        int n = temp.length;
        int[] ans = new int[n];
        int[] stack = new int[n];
        int top = -1;

        for (int i = 0; i < n; i++) {
            while (top != -1 && temp[i] > temp[stack[top]]) {
                int idx = stack[top--];
                ans[idx] = i - idx;
            }
            stack[++top] = i;
        }
        return ans;
    }
}

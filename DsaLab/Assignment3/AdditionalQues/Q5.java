
package AdditionalQues;
import java.util.*;
public class Q5 {
   


    static boolean canBeSorted(int[] A) {
        int n = A.length;
        int[] B = A.clone();
        Arrays.sort(B);

        int[] stack = new int[n];
        int top = -1;
        int j = 0;

        for (int i = 0; i < n; i++) {
            stack[++top] = A[i];
            while (top != -1 && stack[top] == B[j]) {
                top--;
                j++;
            }
        }
        return (top == -1);
    }
}

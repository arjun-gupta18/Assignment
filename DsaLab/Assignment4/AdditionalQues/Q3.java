package AdditionalQues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Q3 {
    static boolean checkSorted(Queue<Integer> q) {
        Stack<Integer> st = new Stack<>();
        int expected = 1;
        int n = q.size();

        while (!q.isEmpty()) {
            int front = q.remove();
            if (front == expected) {
                expected++;
            } else {
                while (!st.isEmpty() && st.peek() == expected) {
                    st.pop();
                    expected++;
                }
                if (!st.isEmpty() && st.peek() < front) {
                    return false;
                }
                st.push(front);
            }
        }

        while (!st.isEmpty() && st.peek() == expected) {
            st.pop();
            expected++;
        }

        return (expected - 1 == n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        String[] input = sc.nextLine().split(" ");
        for (String s : input) {
            q.add(Integer.parseInt(s));
        }

        if (checkSorted(q)) {
            System.out.println("Yes, the queue can be sorted");
        } else {
            System.out.println("No, the queue cannot be sorted");
        }

        sc.close();
    }
}

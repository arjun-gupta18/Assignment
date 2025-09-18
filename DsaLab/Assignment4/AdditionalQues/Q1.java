package AdditionalQues;

import java.util.LinkedList;
import java.util.Queue;

public class Q1 {
    static void generateBinary(int n) {
        Queue<String> q = new LinkedList<>();
        q.add("1");

        for (int i = 0; i < n; i++) {
            String s = q.remove();
            System.out.print(s + " ");
            q.add(s + "0");
            q.add(s + "1");
        }
    }
}

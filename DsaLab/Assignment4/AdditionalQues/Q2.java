package AdditionalQues;

import java.util.Queue;

public class Q2 {
     static int minIndex(Queue<Integer> q, int sortedIndex) {
        int min_index = -1;
        int min_value = Integer.MAX_VALUE;
        int n = q.size();
        for (int i = 0; i < n; i++) {
            int curr = q.remove();
            if (curr <= min_value && i <= sortedIndex) {
                min_index = i;
                min_value = curr;
            }
            q.add(curr);
        }
        return min_index;
    }

    static void insertMinToRear(Queue<Integer> q, int min_index) {
        int min_value = 0;
        int n = q.size();
        for (int i = 0; i < n; i++) {
            int curr = q.remove();
            if (i == min_index) {
                min_value = curr;
            } else {
                q.add(curr);
            }
        }
        q.add(min_value);
    }

    static void sortQueue(Queue<Integer> q) {
        for (int i = 1; i <= q.size(); i++) {
            int min_index = minIndex(q, q.size() - i);
            insertMinToRear(q, min_index);
        }
    }
}

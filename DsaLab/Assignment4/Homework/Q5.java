package Homework;

import java.util.LinkedList;
import java.util.Queue;

public class Q5 {
    class StackTwoQueues {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    void push(int x) {
        q2.add(x);
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    int pop() {
        if (q1.isEmpty()) return -1;
        return q1.remove();
    }

    int top() {
        if (q1.isEmpty()) return -1;
        return q1.peek();
    }

    boolean isEmpty() {
        return q1.isEmpty();
    }
}
}

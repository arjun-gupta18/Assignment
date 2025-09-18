package Homework;

import java.util.LinkedList;
import java.util.Queue;

public class Q3 {
    public static void interleaveQueue(Queue<Integer> q) {
        if (q.size() % 2 != 0) {
            System.out.println("Queue has odd number of elements, cannot interleave!");
            return;
        }

        int halfSize = q.size() / 2;
        Queue<Integer> firstHalf = new LinkedList<>();

        // Move first half into another queue
        for (int i = 0; i < halfSize; i++) {
            firstHalf.add(q.remove());
        }

        // Interleave the two halves
        while (!firstHalf.isEmpty()) {
            q.add(firstHalf.remove()); // take from first half
            q.add(q.remove());         // take from second half
        }
    }
}

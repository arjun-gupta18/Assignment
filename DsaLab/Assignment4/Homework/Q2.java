package Homework;
import java.util.Scanner;
public class Q2 {
    


    static class CircularQueue {
        int[] arr;
        int front, rear, size;

        CircularQueue(int capacity) {
            arr = new int[capacity];
            front = -1;
            rear = -1;
            size = capacity;
        }

        boolean isFull() {
            return (front == 0 && rear == size - 1) || (rear + 1 == front);
        }

        boolean isEmpty() {
            return front == -1;
        }

        void enqueue(int x) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = x;
            System.out.println("Enqueued: " + x);
        }

        void dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }
            System.out.println("Dequeued: " + arr[front]);
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % size;
            }
        }

        void peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }
            System.out.println("Front element: " + arr[front]);
        }

        void display() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }
            System.out.print("Queue: ");
            int i = front;
            while (true) {
                System.out.print(arr[i] + " ");
                if (i == rear) break;
                i = (i + 1) % size;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CircularQueue q = new CircularQueue(5);
        int choice;

        do {
            System.out.println("\n--- Circular Queue Menu ---");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Is Empty?");
            System.out.println("6. Is Full?");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    int val = sc.nextInt();
                    q.enqueue(val);
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.peek();
                    break;
                case 4:
                    q.display();
                    break;
                case 5:
                    System.out.println(q.isEmpty() ? "Queue is Empty" : "Queue is not Empty");
                    break;
                case 6:
                    System.out.println(q.isFull() ? "Queue is Full" : "Queue is not Full");
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 7);

        sc.close();
    }
}

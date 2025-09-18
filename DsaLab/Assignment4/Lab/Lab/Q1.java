package Lab.Lab;

import java.util.Scanner;

public class Q1 {
    static class Queue {
        int[] arr;
        int front, rear, size;

        Queue(int capacity) {
            arr = new int[capacity];
            front = 0;
            rear = -1;
            size = 0;
        }

        void enqueue(int x) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            rear = (rear + 1) % arr.length;
            arr[rear] = x;
            size++;
        }

        void dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }
            System.out.println("Dequeued: " + arr[front]);
            front = (front + 1) % arr.length;
            size--;
        }

        boolean isEmpty() {
            return size == 0;
        }

        boolean isFull() {
            return size == arr.length;
        }

        void display() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }
            System.out.print("Queue: ");
            for (int i = 0; i < size; i++) {
                System.out.print(arr[(front + i) % arr.length] + " ");
            }
            System.out.println();
        }

        void peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }
            System.out.println("Front element: " + arr[front]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue q = new Queue(5);
        int choice;

        do {
            System.out.println("\n--- Queue Menu ---");
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

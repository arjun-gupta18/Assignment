package Homework;

import java.util.Scanner;

public class Q2 {
    class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    Node head;

    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
    }

    int countOccurrences(int key) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            if (temp.data == key) count++;
            temp = temp.next;
        }
        return count;
    }

    void deleteAllOccurrences(int key) {
        while (head != null && head.data == key) head = head.next;
        Node temp = head;
        while (temp != null && temp.next != null) {
            if (temp.next.data == key) temp.next = temp.next.next;
            else temp = temp.next;
        }
    }

    void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class CountAndDelete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinglyLinkedList list = new SinglyLinkedList();
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter data for node " + (i+1) + ": ");
            int data = sc.nextInt();
            list.insertAtEnd(data);
        }
        System.out.print("Enter key to count and delete: ");
        int key = sc.nextInt();
        int count = list.countOccurrences(key);
        System.out.println("Occurrences of " + key + ": " + count);
        list.deleteAllOccurrences(key);
        System.out.println("List after deleting all occurrences of " + key + ":");
        list.display();
    }
}
}
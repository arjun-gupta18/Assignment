package Homework;

public class Q4 {
    
}
class Node {
    char data;
    Node next;
    Node prev;

    Node(char data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList {
    Node head;

    // Insert character at end
    void insertAtEnd(char data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
        newNode.prev = temp;
    }

    // Display list
    void display() {
        Node temp = head;
        System.out.print("Doubly Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Check if palindrome
    boolean isPalindrome() {
        if (head == null) return true;

        // Find tail node
        Node tail = head;
        while (tail.next != null)
            tail = tail.next;

        Node left = head;
        Node right = tail;

        // Compare from both ends
        while (left != right && right.next != left) {
            if (left.data != right.data)
                return false;
            left = left.next;
            right = right.prev;
        }
        return true;
    }
}
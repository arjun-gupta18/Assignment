package Homework;

class Node {
    int data;
    Node next;
    Node prev; 
    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class Q2 {
    void display() {
    if (head == null) {
        System.out.println("List is empty.");
        return;
    }
    Node temp = head;
    System.out.print("Circular Linked List: ");
    do {
        System.out.print(temp.data + " -> ");
        temp = temp.next;
    } while (temp != head);
    System.out.println(head.data + " (head repeated)");
}
}


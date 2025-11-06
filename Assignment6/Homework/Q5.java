package Homework;

public class Q5 {
    
}
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CheckCircular {
    Node head;

    // Insert node at end
    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
    }

    
    void makeCircular() {
        if (head == null) return;
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = head; 
    }

    
    boolean isCircular() {
        if (head == null)
            return false;

        Node temp = head.next;
        while (temp != null && temp != head)
            temp = temp.next;

        return (temp == head);
    }

    public static void main(String[] args) {
        CheckCircular list = new CheckCircular();

        
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);

        System.out.println("Initially Circular? " + list.isCircular());

        
        list.makeCircular();

        System.out.println("After making circular? " + list.isCircular());
    }
}


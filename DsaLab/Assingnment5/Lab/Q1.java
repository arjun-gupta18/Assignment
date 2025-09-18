package Lab;
import java.util.Scanner;
public class Q1 {
    

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

    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

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

    void insertBefore(int key, int data) {
        Node newNode = new Node(data);
        if (head == null) return;
        if (head.data == key) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.data != key) temp = temp.next;
        if (temp.next != null) {
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    void insertAfter(int key, int data) {
        Node temp = head;
        while (temp != null && temp.data != key) temp = temp.next;
        if (temp != null) {
            Node newNode = new Node(data);
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    void deleteFromBeginning() {
        if (head != null) head = head.next;
    }

    void deleteFromEnd() {
        if (head == null) return;
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) temp = temp.next;
        temp.next = null;
    }

    void deleteNode(int key) {
        if (head == null) return;
        if (head.data == key) {
            head = head.next;
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.data != key) temp = temp.next;
        if (temp.next != null) temp.next = temp.next.next;
    }

    int searchNode(int key) {
        Node temp = head;
        int pos = 1;
        while (temp != null) {
            if (temp.data == key) return pos;
            temp = temp.next;
            pos++;
        }
        return -1;
    }

    void display() {
        Node temp = head;
        if (temp == null) {
            System.out.println("List is empty");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class MenuDrivenLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinglyLinkedList list = new SinglyLinkedList();
        while (true) {
            System.out.println("1. Insert at beginning");
            System.out.println("2. Insert at end");
            System.out.println("3. Insert before a node");
            System.out.println("4. Insert after a node");
            System.out.println("5. Delete from beginning");
            System.out.println("6. Delete from end");
            System.out.println("7. Delete a node");
            System.out.println("8. Search a node");
            System.out.println("9. Display");
            System.out.println("10. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            int data, key, pos;
            switch (choice) {
                case 1:
                    System.out.print("Enter data: ");
                    data = sc.nextInt();
                    list.insertAtBeginning(data);
                    break;
                case 2:
                    System.out.print("Enter data: ");
                    data = sc.nextInt();
                    list.insertAtEnd(data);
                    break;
                case 3:
                    System.out.print("Enter key node: ");
                    key = sc.nextInt();
                    System.out.print("Enter data to insert: ");
                    data = sc.nextInt();
                    list.insertBefore(key, data);
                    break;
                case 4:
                    System.out.print("Enter key node: ");
                    key = sc.nextInt();
                    System.out.print("Enter data to insert: ");
                    data = sc.nextInt();
                    list.insertAfter(key, data);
                    break;
                case 5:
                    list.deleteFromBeginning();
                    break;
                case 6:
                    list.deleteFromEnd();
                    break;
                case 7:
                    System.out.print("Enter node to delete: ");
                    key = sc.nextInt();
                    list.deleteNode(key);
                    break;
                case 8:
                    System.out.print("Enter node to search: ");
                    key = sc.nextInt();
                    pos = list.searchNode(key);
                    if (pos == -1) System.out.println("Node not found");
                    else System.out.println("Node found at position: " + pos);
                    break;
                case 9:
                    list.display();
                    break;
                case 10:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

}

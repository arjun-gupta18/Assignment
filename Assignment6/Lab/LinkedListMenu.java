import java.util.Scanner;

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

class CircularLinkedList {
    Node head = null;

    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            Node temp = head;
            while (temp.next != head)
                temp = temp.next;
            newNode.next = head;
            temp.next = newNode;
            head = newNode;
        }
    }

    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head;
            return;
        }
        Node temp = head;
        while (temp.next != head)
            temp = temp.next;
        temp.next = newNode;
        newNode.next = head;
    }

    void insertAfter(int key, int data) {
        if (head == null) return;
        Node temp = head;
        do {
            if (temp.data == key) {
                Node newNode = new Node(data);
                newNode.next = temp.next;
                temp.next = newNode;
                return;
            }
            temp = temp.next;
        } while (temp != head);
        System.out.println("Node " + key + " not found.");
    }

    void deleteNode(int key) {
        if (head == null) return;
        Node curr = head, prev = null;

        if (curr.data == key) {
            Node temp = head;
            while (temp.next != head)
                temp = temp.next;
            if (head.next == head)
                head = null;
            else {
                temp.next = head.next;
                head = head.next;
            }
            return;
        }

        do {
            prev = curr;
            curr = curr.next;
            if (curr.data == key) {
                prev.next = curr.next;
                return;
            }
        } while (curr != head);

        System.out.println("Node " + key + " not found.");
    }

    void search(int key) {
        if (head == null) {
            System.out.println("List empty");
            return;
        }
        Node temp = head;
        int pos = 1;
        do {
            if (temp.data == key) {
                System.out.println("Node " + key + " found at position " + pos);
                return;
            }
            temp = temp.next;
            pos++;
        } while (temp != head);
        System.out.println("Node " + key + " not found.");
    }

    void display() {
        if (head == null) {
            System.out.println("List empty");
            return;
        }
        Node temp = head;
        System.out.print("Circular Linked List: ");
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }
}


class DoublyLinkedList {
    Node head = null;

    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head != null)
            head.prev = newNode;
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
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
        newNode.prev = temp;
    }

    void insertAfter(int key, int data) {
        Node temp = head;
        while (temp != null && temp.data != key)
            temp = temp.next;
        if (temp == null) {
            System.out.println("Node " + key + " not found.");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = temp.next;
        newNode.prev = temp;
        if (temp.next != null)
            temp.next.prev = newNode;
        temp.next = newNode;
    }

    void deleteNode(int key) {
        if (head == null) return;
        Node temp = head;

        // If head node holds the key
        if (temp.data == key) {
            head = temp.next;
            if (head != null)
                head.prev = null;
            return;
        }

        while (temp != null && temp.data != key)
            temp = temp.next;

        if (temp == null) {
            System.out.println("Node " + key + " not found.");
            return;
        }

        if (temp.next != null)
            temp.next.prev = temp.prev;
        if (temp.prev != null)
            temp.prev.next = temp.next;
    }

    void search(int key) {
        Node temp = head;
        int pos = 1;
        while (temp != null) {
            if (temp.data == key) {
                System.out.println("Node " + key + " found at position " + pos);
                return;
            }
            temp = temp.next;
            pos++;
        }
        System.out.println("Node " + key + " not found.");
    }

    void display() {
        if (head == null) {
            System.out.println("List empty");
            return;
        }
        Node temp = head;
        System.out.print("Doubly Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class LinkedListMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CircularLinkedList cll = new CircularLinkedList();
        DoublyLinkedList dll = new DoublyLinkedList();

        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Circular Linked List");
            System.out.println("2. Doubly Linked List");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            if (ch == 3) break;

            if (ch == 1) {
                System.out.println("\n--- Circular Linked List Operations ---");
                System.out.println("1. Insert at Beginning");
                System.out.println("2. Insert at End");
                System.out.println("3. Insert After");
                System.out.println("4. Delete Node");
                System.out.println("5. Search Node");
                System.out.println("6. Display");
                System.out.print("Enter choice: ");
                int op = sc.nextInt();
                int data, key;

                switch (op) {
                    case 1 -> {
                        System.out.print("Enter data: ");
                        data = sc.nextInt();
                        cll.insertAtBeginning(data);
                    }
                    case 2 -> {
                        System.out.print("Enter data: ");
                        data = sc.nextInt();
                        cll.insertAtEnd(data);
                    }
                    case 3 -> {
                        System.out.print("Enter key after which to insert: ");
                        key = sc.nextInt();
                        System.out.print("Enter data: ");
                        data = sc.nextInt();
                        cll.insertAfter(key, data);
                    }
                    case 4 -> {
                        System.out.print("Enter node to delete: ");
                        key = sc.nextInt();
                        cll.deleteNode(key);
                    }
                    case 5 -> {
                        System.out.print("Enter node to search: ");
                        key = sc.nextInt();
                        cll.search(key);
                    }
                    case 6 -> cll.display();
                    default -> System.out.println("Invalid choice!");
                }
            } 
            else if (ch == 2) {
                System.out.println("\n--- Doubly Linked List Operations ---");
                System.out.println("1. Insert at Beginning");
                System.out.println("2. Insert at End");
                System.out.println("3. Insert After");
                System.out.println("4. Delete Node");
                System.out.println("5. Search Node");
                System.out.println("6. Display");
                System.out.print("Enter choice: ");
                int op = sc.nextInt();
                int data, key;

                switch (op) {
                    case 1 -> {
                        System.out.print("Enter data: ");
                        data = sc.nextInt();
                        dll.insertAtBeginning(data);
                    }
                    case 2 -> {
                        System.out.print("Enter data: ");
                        data = sc.nextInt();
                        dll.insertAtEnd(data);
                    }
                    case 3 -> {
                        System.out.print("Enter key after which to insert: ");
                        key = sc.nextInt();
                        System.out.print("Enter data: ");
                        data = sc.nextInt();
                        dll.insertAfter(key, data);
                    }
                    case 4 -> {
                        System.out.print("Enter node to delete: ");
                        key = sc.nextInt();
                        dll.deleteNode(key);
                    }
                    case 5 -> {
                        System.out.print("Enter node to search: ");
                        key = sc.nextInt();
                        dll.search(key);
                    }
                    case 6 -> dll.display();
                    default -> System.out.println("Invalid choice!");
                }
            }
        }

        sc.close();
        System.out.println("Program exited.");
    }
}

import java.util.Scanner;
public class Q1 {
        static int[] arr = new int[100];
        static int size = 0;

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int choice;

            do {
                System.out.println("\n—— MENU ——");
                System.out.println("1. CREATE");
                System.out.println("2. DISPLAY");
                System.out.println("3. INSERT");
                System.out.println("4. DELETE");
                System.out.println("5. LINEAR SEARCH");
                System.out.println("6. EXIT");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1: create(sc); break;
                    case 2: display(); break;
                    case 3: insert(sc); break;
                    case 4: delete(sc); break;
                    case 5: linearSearch(sc); break;
                    case 6: System.out.println("Exiting..."); break;
                    default: System.out.println("Invalid choice! Try again.");
                }
            } while (choice != 6);

            sc.close();
        }

        // CREATE ARRAY
        public static void create(Scanner sc) {
            System.out.print("Enter number of elements: ");
            size = sc.nextInt();
            if (size > arr.length) {
                System.out.println("Size exceeds max limit!");
                return;
            }
            System.out.println("Enter " + size + " elements:");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Array created successfully!");
        }

        // DISPLAY ARRAY
        public static void display() {
            if (size == 0) {
                System.out.println("Array is empty!");
                return;
            }
            System.out.print("Array elements: ");
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        // INSERT ELEMENT
        public static void insert(Scanner sc) {
            if (size == arr.length) {
                System.out.println("Array is full, cannot insert!");
                return;
            }
            System.out.print("Enter element to insert: ");
            int element = sc.nextInt();
            System.out.print("Enter position (0 to " + size + "): ");
            int pos = sc.nextInt();

            if (pos < 0 || pos > size) {
                System.out.println("Invalid position!");
                return;
            }

            for (int i = size; i > pos; i--) {
                arr[i] = arr[i - 1];
            }
            arr[pos] = element;
            size++;
            System.out.println("Element inserted successfully!");
        }

        // DELETE ELEMENT
        public static void delete(Scanner sc) {
            if (size == 0) {
                System.out.println("Array is empty, cannot delete!");
                return;
            }
            System.out.print("Enter position to delete (0 to " + (size - 1) + "): ");
            int pos = sc.nextInt();

            if (pos < 0 || pos >= size) {
                System.out.println("Invalid position!");
                return;
            }

            int deletedElement = arr[pos];
            for (int i = pos; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }
            size--;
            System.out.println("Element " + deletedElement + " deleted successfully!");
        }

        // LINEAR SEARCH
        public static void linearSearch(Scanner sc) {
            if (size == 0) {
                System.out.println("Array is empty!");
                return;
            }
            System.out.print("Enter element to search: ");
            int key = sc.nextInt();
            boolean found = false;

            for (int i = 0; i < size; i++) {
                if (arr[i] == key) {
                    System.out.println("Element found at position: " + i);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Element not found!");
            }
        }
    }



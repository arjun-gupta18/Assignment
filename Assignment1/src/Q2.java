import java.util.Scanner;
public class Q2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Input array
            System.out.print("Enter number of elements: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter " + n + " elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Remove duplicates
            int newSize = removeDuplicates(arr, n);

            // Display result
            System.out.print("Array after removing duplicates: ");
            for (int i = 0; i < newSize; i++) {
                System.out.print(arr[i] + " ");
            }
            sc.close();
        }

        // Function to remove duplicates
        public static int removeDuplicates(int[] arr, int n) {
            if (n == 0 || n == 1) return n;

            int[] temp = new int[n];
            int j = 0;

            for (int i = 0; i < n; i++) {
                boolean isDuplicate = false;
                for (int k = 0; k < j; k++) {
                    if (arr[i] == temp[k]) {
                        isDuplicate = true;
                        break;
                    }
                }
                if (!isDuplicate) {
                    temp[j++] = arr[i];
                }
            }

            // Copy back unique elements
            for (int i = 0; i < j; i++) {
                arr[i] = temp[i];
            }

            return j; // new size of array
        }
    }



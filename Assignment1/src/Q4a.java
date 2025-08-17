import java.util.Scanner;
public class Q4a {
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

            // Reverse array
            reverse(arr, n);

            // Display reversed array
            System.out.print("Reversed Array: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            sc.close();
        }

        // Function to reverse array
        public static void reverse(int[] arr, int n) {
            int start = 0, end = n - 1;
            while (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++;
                end--;
            }
        }
    }



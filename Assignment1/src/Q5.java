import java.util.Scanner;
public class Q5 {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Input dimensions
            System.out.print("Enter number of rows: ");
            int m = sc.nextInt();
            System.out.print("Enter number of columns: ");
            int n = sc.nextInt();

            // Input matrix
            int[][] A = new int[m][n];
            System.out.println("Enter elements of the matrix:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    A[i][j] = sc.nextInt();
                }
            }

            // Sum of each row
            System.out.println("Sum of each column:");
            for (int j = 0; j < n; j++) {
                int colSum = 0;
                for (int i = 0; i < m; i++) {
                    colSum += A[i][j];
                }
                System.out.println("Column " + (j + 1) + ": " + colSum);
            }

            sc.close();
        }
}

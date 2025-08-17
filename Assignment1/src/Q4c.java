import java.util.Scanner;
public class Q4c {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input dimensions
        System.out.print("Enter number of rows: ");
        int m = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int n = sc.nextInt();

        // Input matrix
        int[][] A = new int[m][n];
        System.out.println("Enter elements of Matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // Transpose matrix (n × m)
        int[][] T = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                T[j][i] = A[i][j];
            }
        }

        // Display transpose
        System.out.println("Transpose of the Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(T[i][j] + " ");
            }
            System.out.println();

        }
    }
}

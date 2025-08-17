import java.util.Scanner;
public class Q4b {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Input dimensions
            System.out.print("Enter rows of Matrix A: ");
            int m = sc.nextInt();
            System.out.print("Enter columns of Matrix A: ");
            int n = sc.nextInt();
            System.out.print("Enter columns of Matrix B: ");
            int p = sc.nextInt();

            // Matrix A: m x n
            int[][] A = new int[m][n];
            System.out.println("Enter elements of Matrix A:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    A[i][j] = sc.nextInt();
                }
            }

            // Matrix B: n x p
            int[][] B = new int[n][p];
            System.out.println("Enter elements of Matrix B:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < p; j++) {
                    B[i][j] = sc.nextInt();
                }
            }

            // Resultant Matrix C: m x p
            int[][] C = new int[m][p];

            // Multiplication
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < p; j++) {
                    C[i][j] = 0;
                    for (int k = 0; k < n; k++) {
                        C[i][j] += A[i][k] * B[k][j];
                    }
                }
            }

            // Display Result
            System.out.println("Resultant Matrix (A × B):");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < p; j++) {
                    System.out.print(C[i][j] + " ");
                }
                System.out.println();
            }

            sc.close();
        }
    }



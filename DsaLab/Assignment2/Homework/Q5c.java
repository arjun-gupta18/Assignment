public class Q5c {
    class LowerTriangularMatrix {
        int n;
        int[] arr;

        LowerTriangularMatrix(int n) {
            this.n = n;
            arr = new int[n * (n + 1) / 2];
        }

        void set(int i, int j, int val) {
            if (i >= j) {
                arr[i * (i + 1) / 2 + j] = val;
            }
        }

        int get(int i, int j) {
            if (i >= j) {
                return arr[i * (i + 1) / 2 + j];
            }
            return 0;
        }

        void display() {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(get(i, j) + " ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
    }
}

public class Q5b {
    class TriDiagonalMatrix {
        int n;
        int[] arr;

        TriDiagonalMatrix(int n) {
            this.n = n;
            arr = new int[3 * n - 2];
        }

        void set(int i, int j, int val) {
            if (i - j == 1) arr[i - 1] = val;
            else if (i == j) arr[n - 1 + i] = val;
            else if (j - i == 1) arr[2 * n - 1 + i] = val;
        }

        int get(int i, int j) {
            if (i - j == 1) return arr[i - 1];
            else if (i == j) return arr[n - 1 + i];
            else if (j - i == 1) return arr[2 * n - 1 + i];
            else return 0;
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

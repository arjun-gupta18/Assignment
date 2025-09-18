public class Q5a {
    class DiagonalMatrix {
        int n;
        int[] arr;

        DiagonalMatrix(int n) {
            this.n = n;
            arr = new int[n];
        }

        void set(int i, int j, int val) {
            if (i == j) arr[i] = val;
        }

        int get(int i, int j) {
            if (i == j) return arr[i];
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

        public static void main(String[] args) {
        }
    }
}

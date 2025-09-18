public class Q5e {
    class SymmetricMatrix {
        int n;
        int[] arr;

        SymmetricMatrix(int n) {
            this.n = n;
            arr = new int[n * (n + 1) / 2];
        }

        void set(int i, int j, int val) {
            if (i >= j) {
                arr[i * (i + 1) / 2 + j] = val;
            } else {
                arr[j * (j + 1) / 2 + i] = val; // use symmetry
            }
        }

        int get(int i, int j) {
            if (i >= j) {
                return arr[i * (i + 1) / 2 + j];
            } else {
                return arr[j * (j + 1) / 2 + i];
            }
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

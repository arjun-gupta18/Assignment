import java.util.*;
public class Q6allParts {

    static class SparseMatrix {
        int rows, cols, terms;
        int[][] data;

        SparseMatrix(int r, int c, int t) {
            rows = r;
            cols = c;
            terms = t;
            data = new int[t + 1][3];
            data[0][0] = r;
            data[0][1] = c;
            data[0][2] = t;
        }

        SparseMatrix transpose() {
            SparseMatrix res = new SparseMatrix(cols, rows, terms);
            int[] count = new int[cols];
            int[] index = new int[cols];
            for (int i = 1; i <= terms; i++) count[data[i][1]]++;
            index[0] = 1;
            for (int i = 1; i < cols; i++) index[i] = index[i - 1] + count[i - 1];
            for (int i = 1; i <= terms; i++) {
                int j = data[i][1];
                int pos = index[j]++;
                res.data[pos][0] = data[i][1];
                res.data[pos][1] = data[i][0];
                res.data[pos][2] = data[i][2];
            }
            return res;
        }

        SparseMatrix add(SparseMatrix m) {
            if (rows != m.rows || cols != m.cols) return null;
            SparseMatrix res = new SparseMatrix(rows, cols, 0);
            int i = 1, j = 1, k = 1;
            while (i <= terms && j <= m.terms) {
                int r1 = data[i][0], c1 = data[i][1];
                int r2 = m.data[j][0], c2 = m.data[j][1];
                if (r1 < r2 || (r1 == r2 && c1 < c2)) res.data[k++] = data[i++];
                else if (r2 < r1 || (r1 == r2 && c2 < c1)) res.data[k++] = m.data[j++];
                else {
                    int sum = data[i][2] + m.data[j][2];
                    if (sum != 0) {
                        res.data[k][0] = r1;
                        res.data[k][1] = c1;
                        res.data[k][2] = sum;
                        k++;
                    }
                    i++;
                    j++;
                }
            }
            while (i <= terms) res.data[k++] = data[i++];
            while (j <= m.terms) res.data[k++] = m.data[j++];
            res.terms = k - 1;
            res.data[0][2] = res.terms;
            return res;
        }

        SparseMatrix multiply(SparseMatrix m) {
            if (cols != m.rows) return null;
            SparseMatrix mt = m.transpose();
            SparseMatrix res = new SparseMatrix(rows, m.cols, 0);
            int k = 1;
            for (int i = 0; i < rows; i++) {
                int[] rowA = new int[cols];
                for (int a = 1; a <= terms; a++) {
                    if (data[a][0] == i) rowA[data[a][1]] = data[a][2];
                }
                for (int j = 0; j < m.cols; j++) {
                    int[] rowB = new int[m.rows];
                    for (int b = 1; b <= mt.terms; b++) {
                        if (mt.data[b][0] == j) rowB[mt.data[b][1]] = mt.data[b][2];
                    }
                    int sum = 0;
                    for (int x = 0; x < cols; x++) sum += rowA[x] * rowB[x];
                    if (sum != 0) {
                        res.data[k][0] = i;
                        res.data[k][1] = j;
                        res.data[k][2] = sum;
                        k++;
                    }
                }
            }
            res.terms = k - 1;
            res.data[0][2] = res.terms;
            return res;
        }

        void display() {
            for (int i = 0; i <= terms; i++) {
                System.out.println(data[i][0] + " " + data[i][1] + " " + data[i][2]);
            }
        }
    }

    public class Main {
        public static void main(String[] args) {
            SparseMatrix a = new SparseMatrix(3, 3, 3);
            a.data[1] = new int[]{0, 0, 5};
            a.data[2] = new int[]{1, 1, 8};
            a.data[3] = new int[]{2, 2, 3};

            SparseMatrix b = new SparseMatrix(3, 3, 2);
            b.data[1] = new int[]{0, 1, 6};
            b.data[2] = new int[]{1, 2, 7};

            SparseMatrix t = a.transpose();
            SparseMatrix c = a.add(b);
            SparseMatrix m = a.multiply(b);

            System.out.println("Transpose:");
            t.display();
            System.out.println("Addition:");
            c.display();
            System.out.println("Multiplication:");
            m.display();
        }
    }

}

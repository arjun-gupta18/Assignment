public class Q8 {


            public static void main(String[] args) {
                int[] arr = {1, 2, 2, 3, 4, 4, 5};
                int n = arr.length;
                int count = 0;

                for (int i = 0; i < n; i++) {
                    boolean seen = false;
                    for (int j = 0; j < i; j++) {
                        if (arr[i] == arr[j]) {
                            seen = true;
                            break;
                        }
                    }
                    if (!seen) count++;
                }

                System.out.println("Number of distinct elements: " + count);
            }
        }

    


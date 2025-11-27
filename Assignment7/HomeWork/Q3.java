public class Q3 {
    public static void insertion(int[] arr){
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        System.out.println("After insertion sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {

    }
    }


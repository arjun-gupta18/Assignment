public class Q6 {
    public static void ImprovedSelection(int[] arr){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while (low < high) {
            int minIndex = low;
            int maxIndex = high;
            if (arr[minIndex] > arr[maxIndex]) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[maxIndex];
                arr[maxIndex] = temp;
            }
            for (int i = low + 1; i < high; i++) {
                if (arr[i] < arr[minIndex]) {
                    minIndex = i;
                }
                if (arr[i] > arr[maxIndex]) {
                    maxIndex = i;
                }
            }
            int temp = arr[low];
            arr[low] = arr[minIndex];
            arr[minIndex] = temp;
            if (maxIndex == low) {
                maxIndex = minIndex;
            }
            temp = arr[high];
            arr[high] = arr[maxIndex];
            arr[maxIndex] = temp;
            low++;
            high--;
        }
    }
}

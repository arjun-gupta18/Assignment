public class Q5 {
    public static void heapify(int[] arr,int i,int n) {
        int largest = i;
        int l = 2 * i;
        int r = 2 * i + 1;
        while (l < n && arr[l] > arr[largest]) {
            largest = l;
        }
        while (r < n && arr[r] > arr[largest]) {
            largest = r;
        }
        if (largest != i) {
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;
            heapify(arr, largest, n);
        }
    }
        public static void heapsort(int[] arr,int n){
            for(int i=n/2-1;i>=0;i--){
                heapify(arr,i,n);
            }
            for(int i=n-1;i>=0;i--){
                int temp=arr[0];
                arr[0]=arr[i];
                arr[i]=temp;
                heapify(arr,0,i);
            }
        }
    }


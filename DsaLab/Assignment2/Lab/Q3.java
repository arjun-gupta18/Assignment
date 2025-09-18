public class Q3 {
    public static void main(String[] args) {

    }
    static int findMissing(int[] arr, int n) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;


            if (arr[mid] == mid + 1) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low + 1;
    }
}

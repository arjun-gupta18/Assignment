import java.util.ArrayList;
import java.util.List;

public class Q4 {

    public static void mergesort(int[] arr, int low, int high){
        if(low>=high) return;
        int mid=(low+high)/2;
        mergesort(arr,low,mid);
        mergesort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    public static void merge(int[] arr, int low, int mid, int high){
        int left=low;
        int right=mid+1;
        List<Integer> list=new ArrayList<>();
        while(left<=mid&&right<=high) {
            if (arr[left] < arr[right]) {
                list.add(arr[left++]);
            } else {
                list.add(arr[right++]);
            }
            while (left <= mid) {
                list.add(arr[left++]);
            }
            while (right <= high) {
                list.add(arr[right++]);
            }
        }
    }
    public static void main(String[] args) {

    }
}

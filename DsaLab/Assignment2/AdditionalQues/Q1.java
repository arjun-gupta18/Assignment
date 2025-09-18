package AdditionalQues;

import java.util.*;
public class Q1{
public static int countPairs(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num : arr) {
            count += map.getOrDefault(num - k, 0);
            count += map.getOrDefault(num + k, 0);
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return count / 2; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter K: ");
        int k = sc.nextInt();

        int result = countPairs(arr, k);
        System.out.println("Number of pairs with difference " + k + ": " + result);
    }
}
package BinarySearch.Fundametals;

import java.util.Arrays;

public class LowerBoundOfX {
    public static int findLowerBound(int arr[], int k) {
        Arrays.sort(arr);
        int start = 0, end = arr.length - 1, minIndex = arr.length;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] >= k) {
                minIndex = Math.min(minIndex, mid);
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return minIndex;
    }

    public static void main(String[] args) {
        int arr[] = { 3,5,8,15,19 };
        int k = 3;
        System.out.println(findLowerBound(arr, k));
    }
}
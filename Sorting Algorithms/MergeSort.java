import java.util.ArrayList;
import java.util.List;

public class MergeSort {

    public static void merge(int[] arr, int left, int mid, int right) {
        List<Integer> temp = new ArrayList<>();
        int j = 0;
        int k = mid + 1;
        while (j <= mid && k <= right) {
            if (arr[j] <= arr[k]) {
                temp.add(arr[j]);
                j++;
            } else if (arr[j] >= arr[k]) {
                temp.add(arr[k]);
                k++;
            }
        }

        // Push remaining elements
        while (j <= mid) {
            temp.add(arr[j]);
            j++;
        }
        while (k <= right) {
            temp.add(arr[k]);
            k++;
        }

        // Copying elements to original array
        for (int i = left; i < right; i++) {
            arr[i] = temp.get(i - left);
        }
    }

    public static void mergeSortHelper(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = (start + end) / 2;
        mergeSortHelper(arr, 0, mid);
        mergeSortHelper(arr, mid + 1, end);
        merge(arr, start, mid, end);
    }

    public static int[] mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }
        mergeSortHelper(arr, 0, arr.length - 1);
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11 };
        int[] sortedArr = mergeSort(arr);
        for (int i = 0; i < sortedArr.length; i++) {
            System.out.print(sortedArr[i] + " ");
        }
    }
}

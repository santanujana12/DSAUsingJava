import java.util.ArrayList;
import java.util.List;

public class MergeSort {

    // This function is used to merge two sorted arrays
    public static void merge(int[] arr, int left, int mid, int right) {
        // Temporary array to store sorted elements
        List<Integer> temp = new ArrayList<>();
        int j = left;
        int k = mid + 1;

        // Loop until one of the subarrays is exhausted
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
        for (int i = left; i <= right; i++) {
            /*
             * i-left returns the index of the copied array that means suppose left = 3 now
             * i=3 and 3-3=0 hence at main index 3 the value of 0th index of the temporary
             * array will be copied
             */
            arr[i] = temp.get(i - left);
        }
    }

    public static void mergeSortHelper(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        // Find middle index
        // Main magic happens in finding mid element which divides the array
        int mid = (start + end) / 2;
        // Recursively sort left half
        mergeSortHelper(arr, start, mid);
        // Recursively sort right half
        mergeSortHelper(arr, mid + 1, end);
        // Merge the two halves
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

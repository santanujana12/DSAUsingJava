package BinarySearch.Fundametals;


public class UpperBoundOfX {
    public static int findUpperBound(int arr[], int k) {
        int start = 0, end = arr.length - 1, minIndex = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] <= k) {
                minIndex = Math.max(minIndex, mid);
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return minIndex+1;
    }

    public static void main(String[] args) {
        int arr[] = { 3,5,8,15,19 };
        int k = 9;
        System.out.println(findUpperBound(arr, k));
    }
}

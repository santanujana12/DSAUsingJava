package BinarySearch.LogicBuilding;

public class SearchInRotatedArray {
    private static int search(int arr[], int k) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == k) {
                return mid;
            }
            // checking if mid is greater than previous element
            else if (arr[start] <= arr[mid]) {
                // checking if k is present between start to mid or left half
                if (arr[mid] > k && arr[start] <= k) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (arr[mid] < k && arr[end] >= k) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int k = 0;
        System.out.println(search(arr, k));
    }
}

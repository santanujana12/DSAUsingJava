package BinarySearch.LogicBuilding;

public class SearchInsertPosition {

    public static int searchInsertPosition(int arr[], int target) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 6, 8, 9, 11 };
        int target = 4;
        System.out.println(searchInsertPosition(arr, target));
    }
}

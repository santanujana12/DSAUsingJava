package BinarySearch.LogicBuilding;

public class FirstAndLastOccurence {

    private static int findFirst(int arr[], int target) {
        int res = -1;
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                res = mid;
                end = mid - 1;
            } else if (arr[mid] >= target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return res;
    }

    private static int findLast(int arr[], int target) {
        int res = -1;
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                res = mid;
                start = mid + 1;
            } else if (arr[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return res;
    }

    public static int[] searchRange(int arr[], int target) {
        int result[] = new int[2];

        result[0] = findFirst(arr, target);
        result[1] = findLast(arr, target);

        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 7, 7, 8, 8, 10 };
        int target = 8;
        int result[] = searchRange(arr, target);
        for (var i : result) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

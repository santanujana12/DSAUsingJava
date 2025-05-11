package BinarySearch.LogicBuilding;

public class FloorAndCeilInSortedArray {
    public static int[] getFloorAndCeil(int arr[], int x) {
        int result[] = new int[2];

        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == x) {
                result[0] = x;
                result[1] = x;
                return result;
            } else if (arr[mid] > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        result[0] = (end >= 0) ? arr[end] : -1; // floor
        result[1] = (start < arr.length) ? arr[start] : -1; // ceil
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10, 12, 14 };
        int x = 1;
        int result[] = getFloorAndCeil(arr, x);
        for (var i : result) {
            System.out.print(i + " ");
        }
    }
}

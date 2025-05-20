package BinarySearch.LogicBuilding;

import java.util.ArrayList;

public class SearchInRotatedSortedArrayII {

    public static boolean searchInARotatedSortedArrayII(ArrayList<Integer> arr, int k) {

        int start = 0, end = arr.size() - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr.get(mid) == k) {
                return true;
            }
            if (arr.get(start) == arr.get(mid) && arr.get(mid) == arr.get(end)) {
                start++;
                end--;
            } else if (arr.get(mid) >= arr.get(start)) {
                if (arr.get(mid) > k && k >= arr.get(start)) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (arr.get(mid) < k && k <= arr.get(end)) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int arr1[] = { 7, 8, 1, 2, 3, 3, 3, 4, 5, 6, 10 };
        int k = 1;
        ArrayList<Integer> arr = new ArrayList<>();
        for (int num : arr1) {
            arr.add(num);
        }
        System.out.println(searchInARotatedSortedArrayII(arr, k));
    }
}

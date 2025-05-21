package BinarySearch.LogicBuilding;

import java.util.ArrayList;

public class FindMinimumInRotatedSortedArray {

    public static int findMin(ArrayList<Integer> arr) {
        int start = 0, end = arr.size() - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr.get(mid) > arr.get(end)) {
                start = mid + 1;
            } else {
                end = mid;
            }

        }

        return arr.get(start);
    }

    public static void main(String[] args) {
        int nums[] = { 90, -87, -78, -65, -49, -29, -28, -23, -2, 7, 12, 14, 24, 40, 46, 55, 76, 77, 80, 83 };
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i : nums) {
            arr.add(i);
        }

        System.out.println(findMin(arr));
    }
}

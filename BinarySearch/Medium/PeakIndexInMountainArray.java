package BinarySearch.Medium;

import java.util.ArrayList;
import java.util.Scanner;

public class PeakIndexInMountainArray {
    public static int peakIndexInMountainArray(ArrayList<Integer> arr) {
        int l = 0;
        int r = arr.size() - 1;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (arr.get(mid) > arr.get(mid - 1) && arr.get(mid) > arr.get(mid + 1)) {
                return mid;
            } else if (arr.get(mid) < arr.get(mid + 1)) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        System.out.println(peakIndexInMountainArray(arr));
        sc.close();
    }
}

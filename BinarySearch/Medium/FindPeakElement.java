package BinarySearch.Medium;

import java.util.Scanner;

public class FindPeakElement {
    public static int findPeakElement(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] < nums[mid + 1]) {
                // peak on the right
                l = mid + 1;
            } else {
                // peak on the left or mid
                r = mid;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(findPeakElement(arr));
        scanner.close();
    }
}

package BinarySearch.Medium;

import java.util.Scanner;

public class SearchRange {
    public static int[] searchRange(int[] arr, int target) {
        int[] result = new int[2];
        int l = 0, r = arr.length - 1;
        int start = -1, end = -1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == target) {
                int i = mid, j = mid;
                while (i >= 0 && arr[i] == target) {
                    i--;
                }
                while (j < arr.length && arr[j] == target) {
                    j++;
                }
                start = i + 1;
                end = j - 1;
                break;
            } else if (arr[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        result[0] = start;
        result[1] = end;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int target = sc.nextInt();

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = searchRange(nums, target);
        System.out.println(result[0] + " " + result[1]);
    }
}

package BinarySearch.Medium;

import java.util.Scanner;

public class FindSingleElementInASortedArray {
    public static int singleNonDuplicate(int[] arr) {
        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {
            int m = l + (r - l) / 2;
            if ((m == 0 || arr[m] != arr[m - 1]) && (m == arr.length - 1 || arr[m] != arr[m + 1])) {
                return arr[m];
            } else {
                int rightLength;
                if (m > 0 && arr[m] == arr[m - 1]) {
                    rightLength = r - m;
                    if (rightLength % 2 == 0) {
                        r = m - 2;
                    } else {
                        l = m + 1;
                    }
                } else if (m < arr.length - 1 && arr[m] == arr[m + 1]) {
                    rightLength = r - m + 1;
                    if (rightLength % 2 == 0) {
                        r = m - 1;
                    } else {
                        l = m + 2;
                    }
                }
            }
        }

        return -1; // Just in case, but ideally this should never be reached
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(singleNonDuplicate(arr));
        sc.close();
    }

}
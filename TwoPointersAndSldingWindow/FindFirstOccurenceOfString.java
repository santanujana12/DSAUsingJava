package TwoPointersAndSldingWindow;

import java.util.Scanner;

public class FindFirstOccurenceOfString {

    public static int strStr(String haystack, String needle) {
        int m = needle.length();
        int n = haystack.length();

        // Edge case: if needle is empty, return 0
        if (m == 0) {
            return 0;
        }

        // Step 1: Build the LPS (Longest Prefix Suffix) array
        int[] lps = new int[m];
        int i = 0, j = 1;

        while (j < m) {
            if (needle.charAt(i) == needle.charAt(j)) {
                lps[j] = i + 1;
                i++;
                j++;
            } else {
                if (i == 0) {
                    lps[j] = 0;
                    j++;
                } else {
                    i = lps[i - 1];
                }
            }
        }

        // Step 2: Search the needle in the haystack using the LPS array
        i = 0;
        j = 0;
        while (i < n) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            } else {
                if (j == 0) {
                    i++;
                } else {
                    j = lps[j - 1];
                }
            }
            if (j == m) {
                return i - j;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();

        System.out.println(strStr(a, b));
    }
}

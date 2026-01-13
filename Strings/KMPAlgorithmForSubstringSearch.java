package Strings;

import java.util.*;

public class KMPAlgorithmForSubstringSearch {

    public static int strStr(String haystack, String needle) {
        if (needle.length() == 0)
            return 0;

        int[] lps = new int[needle.length()];

        // Build LPS array
        int i = 0, j = 1;
        while (j < needle.length()) {
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

        // KMP search
        i = 0;
        j = 0;
        while (i < haystack.length()) {
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

            if (j == needle.length()) {
                return i - j;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        System.out.println(strStr(a, b));
        sc.close();
    }
}

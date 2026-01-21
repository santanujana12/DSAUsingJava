package TwoPointersAndSldingWindow;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PermutationInString {

    public static boolean checkInclusion(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int i = 0, j = m - 1;

        Map<Character, Integer> freq1 = new HashMap<>();

        // Frequency map of s1
        for (int idx = 0; idx < m; idx++) {
            char ch = s1.charAt(idx);
            freq1.put(ch, freq1.getOrDefault(ch, 0) + 1);
        }

        while (j < n) {
            Map<Character, Integer> freq2 = new HashMap<>();
            int k = i;

            // Build frequency map for current window
            while (k <= j) {
                char ch = s2.charAt(k);
                freq2.put(ch, freq2.getOrDefault(ch, 0) + 1);
                k++;
            }

            if (freq2.equals(freq1)) {
                return true;
            } else {
                i++;
                j++;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        boolean isPermutation = checkInclusion(s1, s2);
        System.out.println(isPermutation ? "True" : "False");

        sc.close();
    }
}

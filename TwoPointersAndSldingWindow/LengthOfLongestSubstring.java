

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LengthOfLongestSubstring {

    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int n = s.length();
        int i = 0;

        Map<Character, Integer> substring = new HashMap<>();

        for (int j = 0; j < n; j++) {
            char ch = s.charAt(j);

            if (substring.containsKey(ch) && substring.get(ch) >= i) {
                i = substring.get(ch) + 1;
            }

            substring.put(ch, j);
            maxLength = Math.max(maxLength, j - i + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(lengthOfLongestSubstring(s));
        sc.close();
    }
}

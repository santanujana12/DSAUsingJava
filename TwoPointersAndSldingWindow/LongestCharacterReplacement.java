import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestCharacterReplacement {

    public static int characterReplacement(String s, int k) {
        Map<Character, Integer> freq = new HashMap<>();
        int maxCharReplacement = 0;
        int i = 0, n = s.length(), maxFreqCount = 0;

        for (int j = 0; j < n; j++) {
            char ch = s.charAt(j);
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
            maxFreqCount = Math.max(maxFreqCount, freq.get(ch));

            // Shrink window if replacements exceed k
            while ((j - i + 1) - maxFreqCount > k) {
                char leftChar = s.charAt(i);
                freq.put(leftChar, freq.get(leftChar) - 1);
                i++;
            }

            maxCharReplacement = Math.max(maxCharReplacement, j - i + 1);
        }

        return maxCharReplacement;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        System.out.println(characterReplacement(s, k));
        sc.close();
    }
}

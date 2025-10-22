package Strings;

import java.util.HashMap;

public class MaxFreqSum {

    public static int maxFreqSum(String s) {
        int maxVowelCount = 0;
        int maxConsonantCount = 0;

        HashMap<Character, Integer> vowelCount = new HashMap<>();
        HashMap<Character, Integer> consonantCount = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
                vowelCount.put(currentChar, vowelCount.getOrDefault(currentChar, 0) + 1);
            } else {
                consonantCount.put(currentChar, consonantCount.getOrDefault(currentChar, 0) + 1);
            }
        }

        for (int count : vowelCount.values()) {
            maxVowelCount = Math.max(maxVowelCount, count);
        }

        for (int count : consonantCount.values()) {
            maxConsonantCount = Math.max(maxConsonantCount, count);
        }

        return maxConsonantCount + maxVowelCount;
    }

    public static void main(String[] args) {
        String s = "successes";
        System.out.println(maxFreqSum(s));
    }
}

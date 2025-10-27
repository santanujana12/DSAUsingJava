package Strings;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> freq = new HashMap<>();

        for (char c : s.toCharArray()) {
            if (freq.containsKey(c)) {
                freq.put(c, freq.get(c) + 1);
            } else {
                freq.put(c, 1);
            }
        }

        for (char c : t.toCharArray()) {
            if (freq.containsKey(c)) {
                freq.put(c, freq.get(c) - 1);
            } else {
                freq.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : freq.entrySet()){
            if(entry.getValue()>0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "aba";
        String t = "abcd";
        System.out.println(isAnagram(s, t));
    }
}

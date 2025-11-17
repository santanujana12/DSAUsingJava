package Strings;

import java.util.HashMap;

public class IsomorphicStrings {

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> mappedS = new HashMap<>();
        HashMap<Character, Character> mappedT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            if (mappedS.containsKey(charS)) {
                if (mappedS.get(charS) != charT) {
                    return false;
                }
            } else {
                mappedS.put(charS, charT);
            }

            if (mappedT.containsKey(charT)) {
                if (mappedT.get(charT) != charS) {
                    return false;
                }
            } else {
                mappedT.put(charT, charS);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        System.out.println(isIsomorphic(s, t));
    }
}
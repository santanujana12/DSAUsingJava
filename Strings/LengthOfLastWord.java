package Strings;

import java.util.ArrayList;

public class LengthOfLastWord {

    public static int lengthOfLastWord(String s) {
        ArrayList<String> resultList = new ArrayList<>();
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == ' ') {
                i++;
            } else {
                String a = "";
                while (i < s.length() && s.charAt(i) != ' ') {
                    a += s.charAt(i);
                    i++;
                }
                resultList.add(a);
            }
        }
        if (!resultList.isEmpty()) {
            return resultList.get(resultList.size() - 1).length();
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        String s = "luffy is still joyboy";
        System.out.println(lengthOfLastWord(s));
    }
}

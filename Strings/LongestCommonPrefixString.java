import java.util.*;

public class LongestCommonPrefixString {

    public static String longestCommonPrefix(List<String> strs) {
        if (strs == null || strs.isEmpty()) {
            return "";
        }
        
        String result = strs.get(0);
        for (int i = 1; i < strs.size(); i++) {
            int j = 0;
            while (j < result.length() && j < strs.get(i).length() && result.charAt(j) == strs.get(i).charAt(j)) {
                j++;
            }
            result = result.substring(0, j);
            if (result.isEmpty()) {
                return "";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> s = new ArrayList<>(Arrays.asList("flower", "flow", "flight"));
        System.out.println(longestCommonPrefix(s));  
    }
}

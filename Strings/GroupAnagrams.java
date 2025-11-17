import java.util.*;

public class GroupAnagrams {
    
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> freq = new HashMap<>();
        
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);
            
            if (!freq.containsKey(sortedStr)) {
                freq.put(sortedStr, new ArrayList<>());
            }
            freq.get(sortedStr).add(str);
        }
    
        result.addAll(freq.values());
        
        return result;
    }
    
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams(strs);
        
        for (List<String> group : result) {
            for (String word : group) {
                System.out.println(word);
            }
        }
    }
}

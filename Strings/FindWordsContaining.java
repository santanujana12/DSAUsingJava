package Strings;

import java.util.ArrayList;
import java.util.List;

public class FindWordsContaining {

    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if(words[i].charAt(j)==x){
                    result.add(i);
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] words = {"abc","bcd","aaaa","cbc"};
        char x = 'c';
        List<Integer> results = findWordsContaining(words, x);
        for (Integer result : results) {
            System.out.println(result);
        }
    }
}

package Strings;

public class ReverseFirstKCharacters {

    public static String reverseString(String s, int k) {
        int n = s.length();
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < n; i += (2 * k)) {
            int lenToReverse = Math.min(k, n - i); 
            String sub = sb.substring(i, i + lenToReverse);
            String reversedSub = new StringBuilder(sub).reverse().toString();
            sb.replace(i, i + lenToReverse, reversedSub);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "abcdefghij";
        int k = 2;
        // System.out.println(s.charAt((k-1)/2));
        String reversedString = reverseString(s, k);
        System.out.println(reversedString);
    }
}

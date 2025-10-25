package Strings;

public class ValidPalindromeString {

    public static boolean isAlphanumeric(char ch) {
        return Character.isLetter(ch) || Character.isDigit(ch);
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String result = "";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(isAlphanumeric(ch)){
                result+=ch;
            }
        }

        int n = result.length();
        for(int i=0;i<n/2;i++){
            if(result.charAt(i)!=result.charAt(n-i-1)){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = " ";
        System.out.println(isPalindrome(s));
    }
}

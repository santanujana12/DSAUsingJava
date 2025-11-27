package Strings;

public class RemoveOuterMostParenthesis {
    public static String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int openCount = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (openCount > 0) {
                    result.append(ch);
                }
                openCount++;
            } else if (ch == ')') {
                openCount--;
                if (openCount > 0) {
                    result.append(ch);
                }
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "(()())(())(()(()))";
        String result = removeOuterParentheses(s);
        System.out.println(result); // Output: ()()()()(())
    }
}
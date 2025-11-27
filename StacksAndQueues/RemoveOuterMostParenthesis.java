package StacksAndQueues;

import java.util.Stack;

public class RemoveOuterMostParenthesis {
      public static String removeOuterParentheses(String s) {
        StringBuilder res = new StringBuilder();
        // Use the Java Stack class, specifying the generic type <Character>
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (currentChar == '(') {
                // If the stack is NOT empty, it means we are inside an inner pair, so append the '('
                if (!st.isEmpty()) {
                    res.append(currentChar);
                }
                // Push the current '(' onto the stack
                st.push(currentChar);
            } else {
                // When we encounter a ')', pop the matching '(' from the stack
                st.pop();
                // If the stack is NOT empty AFTER the pop, it means we are inside an inner pair, so append the ')'
                if (!st.isEmpty()) {
                    res.append(currentChar);
                }
            }
        }
        
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "(()())(())(()(()))";
        String result = removeOuterParentheses(s);
        System.out.println(result); // Output: ()()()()(())
    }
}

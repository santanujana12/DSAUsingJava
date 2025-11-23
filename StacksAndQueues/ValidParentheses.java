package StacksAndQueues;

import java.util.*;

public class ValidParentheses {

    public static boolean isValid(String s) {
        Stack<Character> bracket = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                bracket.push(ch);
            } else {
                if (bracket.empty()) {
                    return false;
                } else if (ch == ')') {
                    char top = bracket.peek();
                    if (top != '(') {
                        return false;
                    } else {
                        bracket.pop();
                    }
                } else if (ch == '}') {
                    char top = bracket.peek();
                    if (top != '{') {
                        return false;
                    } else {
                        bracket.pop();
                    }
                } else if (ch == ']') {
                    char top = bracket.peek();
                    if (top != '[') {
                        return false;
                    } else {
                        bracket.pop();
                    }
                }
            }
        }
        return bracket.empty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next(); // reads one token like your C++ code
        boolean result = isValid(s);
        if (result) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        sc.close();
    }
}

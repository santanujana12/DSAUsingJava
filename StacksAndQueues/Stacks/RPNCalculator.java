package StacksAndQueues.Stacks;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class RPNCalculator {

    // Method to perform the operation based on the operator
    public static int calculate(int a, int b, String sign) {
        char op = sign.charAt(0);
        switch (op) {
            case '+':
                return b + a;
            case '-':
                return b - a;
            case '/':
                return b / a;
            case '*':
                return b * a;
            default:
                return 0;
        }
    }

    // Method to evaluate the RPN expression
    public static int evalRPN(List<String> tokens) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < tokens.size(); i++) {
            String token = tokens.get(i);
            if (!token.equals("+") && !token.equals("-") && !token.equals("*") && !token.equals("/")) {
                st.push(Integer.parseInt(token)); // Push number onto the stack
            } else {
                int a = st.pop(); // Pop top element from the stack
                int b = st.pop(); // Pop next top element from the stack
                st.push(calculate(a, b, token)); // Perform the operation and push result back
            }
        }
        return st.peek(); // The result is the top element of the stack
    }

    public static void main(String[] args) {
        List<String> tokens = Arrays.asList("2", "1", "+", "3", "*");
        int result = evalRPN(tokens);
        System.out.println("Result: " + result); // Output: 9
    }
}

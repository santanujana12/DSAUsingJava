package StacksAndQueues;

import java.util.Stack;

public class MinStack {
    private Stack<Integer> s;
    private Stack<Integer> m;

    public MinStack() {
        s = new Stack<>();
        m = new Stack<>();
    }

    public void push(int val) {
        if (m.isEmpty()) {
            m.push(val);
        } else {
            m.push(Math.min(m.peek(), val));
        }
        s.push(val);
    }

    public void pop() {
        if (!s.isEmpty() && !m.isEmpty()) {
            s.pop();
            m.pop();
        }
    }

    public int top() {
        return s.peek();
    }

    public int getMin() {
        return m.peek();
    }
}

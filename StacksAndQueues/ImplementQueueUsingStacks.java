import java.util.Stack;

class ImplementStackUsingTwoQueues {
    private Stack<Integer> s1;
    private Stack<Integer> s2;

    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    // Push element x to the back of queue
    public void push(int x) {
        s1.push(x);
    }

    // Removes the element from the front of queue and returns it
    public int pop() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    // Get the front element
    public int peek() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }

    // Returns true if the queue is empty
    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }
}

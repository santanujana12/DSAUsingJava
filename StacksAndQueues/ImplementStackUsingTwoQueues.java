package StacksAndQueues;

import java.util.LinkedList;
import java.util.Queue;

class ImplementStackUsingTwoQueues {

    private Queue<Integer> q1;
    private Queue<Integer> q2;

    public ImplementStackUsingTwoQueues() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int x) {
        q1.offer(x);
    }

    public int pop() {
        while (q1.size() > 1) {
            q2.offer(q1.poll());
        }
        int result = q1.poll();
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return result;
    }

    public int top() {
        while (q1.size() > 1) {
            q2.offer(q1.poll());
        }
        int result = q1.peek();
        q2.offer(q1.poll());
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return result;
    }

    public boolean empty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {
        ImplementStackUsingTwoQueues stack = new ImplementStackUsingTwoQueues();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.top()); // Should print 30
        System.out.println("Popped element: " + stack.pop()); // Should print 30
        System.out.println("Top after pop: " + stack.top()); // Should print 20
        System.out.println("Is stack empty? " + stack.empty()); // Should print false

        stack.pop();
        stack.pop();
        System.out.println("Is stack empty now? " + stack.empty()); // Should print true
    }
}

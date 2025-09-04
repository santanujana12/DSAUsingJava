package LinkedList;

public class FindPalindromeLinkedList {

    public static Node reverseLinkedList(Node head) {
        Node curr = head;
        Node prev = null;
        while (curr != null) {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        head = prev;
        return head;
    }

    public static Node findMiddleNode(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static boolean findPalindrome(Node head) {
        Node middle = findMiddleNode(head);
        Node secondHalf = middle;

        Node reversed = reverseLinkedList(secondHalf);
        Node curr = head;
        while (reversed != null) {
            if (curr.data != reversed.data) {
                return false;
            }
            reversed = reversed.next;
            curr = curr.next;
        }

        return true;
    }

    public static boolean isPalindrome(Node head) {
        Node curr = head;
        return findPalindrome(curr);
    }

    public static void main(String[] args) {
        LinkedListBlueprint list = new LinkedListBlueprint();
        // for (int i = 1; i <= 10; i++) {
        //     list.addNode(i);
        // }
        list.addNode(1);
        list.addNode(2);
        list.addNode(2);
        list.addNode(1);

        Node head = list.getHead();
        list.printLinkedList(head);

        boolean isPalindrome = isPalindrome(head);
        System.out.println(isPalindrome);
    }
}

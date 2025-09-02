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
        Node fast = head.next;
        while (fast != null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // public static boolean findPalindrome(Node actual, Node reversed) {
        

    //     return true;
    // }

    // public static boolean isPalindrome(Node head) {
    //     Node reversed = reverseLinkedList(head);
    //     Node curr = head;
    //     return findPalindrome(curr, reversed);
    // }

    public static void main(String[] args) {
        LinkedListBlueprint list = new LinkedListBlueprint();
        // list.addNode(1);
        // list.addNode(2);
        // list.addNode(2);
        // list.addNode(1);

        Node head = list.getHead();
        list.printLinkedList(head);

        // list.printLinkedList(reversed);
        list.printLinkedList(head);

        // boolean isPalindrome = isPalindrome(head);
        // System.out.println(isPalindrome);
    }
}

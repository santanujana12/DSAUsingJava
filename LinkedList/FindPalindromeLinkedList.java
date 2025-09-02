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

    public static boolean findPalindrome(Node head, Node reversed) {
        Node curr = head;
        while (curr!= null) {
            System.out.println(reversed.data+" "+curr.data);
            if (reversed.data != curr.data) {
                return false;
            }
            curr = curr.next;
            reversed = reversed.next;
        }
        return true;
    }

    public static void main(String[] args) {
        LinkedListBlueprint list = new LinkedListBlueprint();
        // for (int i = 1; i <= 10; i++) {
        //     list.addNode(i);
        // }
        list.addNode(1);
        list.addNode(2);

        Node head = list.getHead();
        // list.printLinkedList(head);
        Node reversed = reverseLinkedList(head);
        // list.printLinkedList(reversed);

        boolean isPalindrome = findPalindrome(head, reversed);

        System.out.println(isPalindrome);
    }
}

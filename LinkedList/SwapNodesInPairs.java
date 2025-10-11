package LinkedList;

public class SwapNodesInPairs {

    public static Node swapPairs(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node dummy = new Node(-1);
        dummy.next = head;
        Node prev = dummy;
        while (prev.next != null && prev.next.next != null) {
            Node first = prev.next;
            Node second = first.next;

            first.next = second.next;
            second.next = first;
            prev.next = second;
            prev = first;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        LinkedListBlueprint list1 = new LinkedListBlueprint();
        for (int i = 1; i <= 6; i++) {
            list1.addNode(i);
        }

        Node head = list1.getHead();
        Node result = swapPairs(head);
        list1.printLinkedList(result);
    }
}

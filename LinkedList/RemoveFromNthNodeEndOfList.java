package LinkedList;

public class RemoveFromNthNodeEndOfList {

    public static Node removeNthFromEnd(Node head, int n) {
        Node dummy = new Node(0);
        dummy.next = head;
        int count = 0;
        Node curr = dummy.next;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        curr = dummy;
        for (int i = 0; i < count - n; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;

        return dummy.next;
    }

    public static void main(String[] args) {
        LinkedListBlueprint list = new LinkedListBlueprint();
        for (int i = 1; i <= 1; i++) {
            list.addNode(i);
        }
        int n = 1;
        Node curr = list.getHead();
        Node res = removeNthFromEnd(curr, n);
        list.printLinkedList(res);
    }
}

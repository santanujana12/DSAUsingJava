package LinkedList;

public class ReverseLinkedList {

    public static void main(String[] args) {
        LinkedListBlueprint list = new LinkedListBlueprint();
        for (int i = 1; i <= 10; i++) {
            list.addNode(i);
        }

        Node head = list.getHead();
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        head = prev;
        list.printLinkedList(head);

    }
}

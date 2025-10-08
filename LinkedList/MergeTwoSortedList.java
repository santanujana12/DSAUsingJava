package LinkedList;

public class MergeTwoSortedList {

    public static Node mergeTwoLists(Node head1, Node head2) {
        Node result = new Node(-1);
        Node dummy = result;
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                Node addNode = new Node(head1.data);
                dummy.next = addNode;
                head1 = head1.next;
            } else {
                Node addNode = new Node(head2.data);
                dummy.next = addNode;
                head2 = head2.next;
            }
            dummy = dummy.next;
        }

        if (head1 != null) {
            dummy.next = head1;
        }

        if (head2 != null) {
            dummy.next = head2;
        }

        return result.next;
    }

    public static void main(String[] args) {
        LinkedListBlueprint list1 = new LinkedListBlueprint();
        LinkedListBlueprint list2 = new LinkedListBlueprint();

        list1.addNode(1);
        list1.addNode(2);
        list1.addNode(4);
        list1.addNode(5);

        list2.addNode(1);
        list2.addNode(3);
        list2.addNode(4);
        list2.addNode(5);
        list2.addNode(6);

        Node head1 = list1.getHead();
        Node head2 = list2.getHead();
        Node merged = mergeTwoLists(head1, head2);
        list1.printLinkedList(merged);
    }
}

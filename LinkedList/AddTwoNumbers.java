package LinkedList;

public class AddTwoNumbers {

    public static Node addTwoNumbers(Node head1, Node head2) {
        Node curr1 = head1;
        Node curr2 = head2;
        Node res = new Node(-1);
        Node result = res;
        int carry = 0;
        while (curr1 != null || curr2 != null || carry!=0) {
            int sum = carry;
            if (curr1 != null) {
                sum += curr1.data;
                curr1 = curr1.next;
            }
            if (curr2 != null) {
                sum += curr2.data;
                curr2 = curr2.next;
            }
            carry = sum/10;
            Node addNode = new Node(sum%10);
            result.next = addNode;
            result = result.next;
        }
        return res.next;
    }

    public static void main(String[] args) {
        LinkedListBlueprint list1 = new LinkedListBlueprint();
        LinkedListBlueprint list2 = new LinkedListBlueprint();

        list1.addNode(2);
        list1.addNode(4);
        list1.addNode(3);

        list2.addNode(5);
        list2.addNode(6);
        list2.addNode(4);

        Node head1 = list1.getHead();
        Node head2 = list2.getHead();

        Node result = addTwoNumbers(head1, head2);
        list1.printLinkedList(result);
    }
}

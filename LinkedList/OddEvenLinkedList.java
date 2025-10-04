package LinkedList;

public class OddEvenLinkedList {

    public static Node oddEvenList(Node head) {
        if(head==null || head.next==null){
            return head;
        }
        Node even = head.next;
        Node odd = head;
        Node evenHead = even;
        while (even.next != null && odd.next != null) {
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }

    public static void main(String[] args) {
        LinkedListBlueprint list = new LinkedListBlueprint();
        for (int i = 1; i <= 10; i++) {
            list.addNode(i);
        }
        Node head = list.getHead();
        Node res = oddEvenList(head);
        list.printLinkedList(res);
    }
}

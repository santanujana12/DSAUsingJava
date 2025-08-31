package LinkedList;

public class MiddleOfLinkedList {

    public static void main(String[] args) {
        LinkedListBlueprint list = new LinkedListBlueprint();
        for(int i=1;i<=10;i++){
            list.addNode(i);
        }

        Node head = list.getHead();
        Node slow = head;
        Node fast = head;
        list.printLinkedList(head);

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
    }
}

package LinkedList;

public class LinkedListCycle {

    public static void main(String[] args) {
        LinkedListBlueprint list = new LinkedListBlueprint();
        for (int i = 1; i <= 10; i++) {
            list.addNode(i);
        }

        Node slow = list.getHead();
        Node fast = slow.next;
        while(fast!=slow){
            if(fast==null || fast.next == null){
                System.out.println("No loop detected");
                break;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Loop detected");
    }
}

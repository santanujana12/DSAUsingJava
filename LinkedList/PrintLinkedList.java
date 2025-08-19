package LinkedList;

public class PrintLinkedList extends LinkedListBlueprint {
    public PrintLinkedList() {
        super();
        System.out.println("Constructor called");
    }

    public static void main(String[] args) {
        PrintLinkedList list = new PrintLinkedList();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);
        list.addNode(6);
        list.addNode(7);

        list.printLinkedList();
        System.out.println("Size of LL: " + list.getSize());
        list.deleteNode(9);

        list.printLinkedList();
        System.out.println("Size of LL: " + list.getSize());
    }
}
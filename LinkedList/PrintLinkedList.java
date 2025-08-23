package LinkedList;

public class PrintLinkedList extends LinkedListBlueprint {
    public PrintLinkedList() {
        super();
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
        list.addAtHead(99);
        System.out.println("After adding on head");
        list.printLinkedList();
        list.addAtTail(100);
        System.out.println("After adding at tail");
        list.printLinkedList();
        System.out.println("Element at index"+list.getAtIndex(2));

        list.addAtIndex(500, 3);
        System.out.println("After adding at index");
        list.printLinkedList();
        list.deleteAtIndex(2);
        System.out.println("After deletion at index");
        list.printLinkedList();
    }
}
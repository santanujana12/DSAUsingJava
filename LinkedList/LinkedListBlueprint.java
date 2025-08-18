package LinkedList;

class Node {

    int data;
    Node next = null;

    public Node(int data) {
        System.out.println("Constructor called");
        this.data = data;
    }
}

public class LinkedListBlueprint {

    private Node head;
    private int size = 0;

    public int getSize() {
        return size;
    }

    public void addNode(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        this.size++;
    }

    public void printLinkedList() {
        if (head == null) {
            System.out.println("Empty Linked List");
        } else {
            Node curr = head;
            while (curr != null) {
                System.out.println(curr.data);
                curr = curr.next;
            }
        }
    }

    public void deleteNode(int data){
        
    }

}

package LinkedList;

class Node {

    int data;
    Node next = null;

    public Node(int data) {
        this.data = data;
    }
}

public class LinkedListBlueprint {

    private Node head;
    private int size = 0;

    public Node getHead(){
        return head;
    }

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

    public void addAtHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        this.size++;
    }

    public void addAtTail(int data) {
        Node curr = head;
        Node newNode = new Node(data);
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
        this.size++;
    }

    public void printLinkedList(Node head) {
        if (head == null) {
            System.out.println("Empty Linked List");
        } else {
            Node curr = head;
            while (curr != null) {
                System.out.print(curr.data+" ");
                curr = curr.next;
            }
        }
        System.out.println();
    }

    public void deleteNode(int data) {
        if (head.data == data) {
            head = head.next;
        } else {
            Node curr = head;
            while (curr != null && curr.next != null) {
                if (curr.next.data == data) {
                    Node takeNext = curr.next.next;
                    curr.next = takeNext;
                    this.size--;
                } else {
                    curr = curr.next;
                }
            }
            if (curr == null) {
                System.out.println("No data found");
            }
        }
    }

    public int getAtIndex(int index){
        if(index<0 || index>size){
            return -1;
        }
        int count = 0;
        Node curr = head;
        while(curr!=null){
            if(count==index){
                return curr.data;
            }
            curr=curr.next;
            count++;
        }
        return -1;
    }

    public void addAtIndex(int data,int index){
        if(index<0 || index>size){
            System.out.println("Invalid index");
            return;
        }
        int count = 0;
        Node curr = head;
        while(curr!=null){
            if(count==index-1){
                Node newNode = new Node(data);
                newNode.next = curr.next;
                curr.next = newNode;
            }
            count++;
            curr=curr.next;
        }
        this.size++;
    }

    public void deleteAtIndex(int index){
        if(index<0 || index>size){
            System.out.println("Invalid index");
            return;
        }
        int count=0;
        Node curr = head;
        while(curr!=null){
            if(count==index-1){
                curr.next = curr.next.next;
            }
            count++;
            curr = curr.next;
        }
        this.size--;
    }

    public Node reverseLinkedList(Node head){
        Node curr = head;
        Node prev = null;
      
        while(curr!=null){
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        head = prev;

        return head;
    }
}

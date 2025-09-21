package LinkedList;

public class RemoveFromNthNodeEndOfListOnePass {
    public static Node removeNthFromEnd(Node head,int n){
        Node dummy = new Node(0);
        dummy.next = head;
        Node fast = dummy;
        Node slow = dummy;
        int count = n;
        while(count>=0){
            fast = fast.next;
            count--;
        }
        while(fast!=null && fast.next!=null){
            System.out.println(fast.data+", "+slow.data);
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return dummy.next;
    }

    public static void main(String[] args) {
        LinkedListBlueprint list = new LinkedListBlueprint();
        for (int i = 1; i <= 10; i++) {
            list.addNode(i);
        }
        int n = 5;
        Node curr = list.getHead();
        Node res = removeNthFromEnd(curr, n);
        list.printLinkedList(res);
    }
}

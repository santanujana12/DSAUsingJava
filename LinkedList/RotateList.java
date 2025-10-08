package LinkedList;

public class RotateList {

    public static Node rotateRight(Node head, int k) {
        if(head==null || head.next==null || k==0){
            return head;
        }
        int length = 0;
        Node curr = head;
        while(curr!=null){
            length++;
            curr = curr.next;
        }
       
        k = k%length;
        if(k==0){
            return head;
        }
        curr = head;
        for(int i=0;i<length-k-1;i++){
            curr = curr.next;
        }
        Node tail = curr.next;
        curr.next = null;
        Node addAtHead = tail;
        while(tail.next!=null){
            tail = tail.next;
        }
        tail.next = head;
        return addAtHead;
    }

    public static void main(String[] args) {
        LinkedListBlueprint list = new LinkedListBlueprint();

        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);
        list.addNode(6);

        Node head = list.getHead();
        Node result = rotateRight(head, 10);

        list.printLinkedList(result);
    }
}

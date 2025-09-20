package LinkedList;

public class RemoveFromLinkedList {

    public static Node removeElements(Node head, int val) {
        if (head == null || head.next == null) {
            return null;
        }
        Node dummy = new Node(0);
        dummy.next = head;
        Node curr = dummy;
        while(curr!=null && curr.next!=null){
            if(curr.next.data==val){
                curr.next = curr.next.next;
            }else{
                curr = curr.next;
            }
        }
        return dummy.next; 
    }

    public static void main(String[] args) {
        LinkedListBlueprint list = new LinkedListBlueprint();
        list.addNode(7);
        list.addNode(7);
        list.addNode(6);
        list.addNode(7);
        Node head = list.getHead();

        Node removedElementNode = removeElements(head, 7);
        list.printLinkedList(removedElementNode);
    }
}

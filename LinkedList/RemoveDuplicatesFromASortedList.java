package LinkedList;

public class RemoveDuplicatesFromASortedList {
    public static Node deleteDuplicates(Node head) {
        Node curr = head;
        while(curr!=null && curr.next!=null){
            if(curr.data == curr.next.data){
                curr.next = curr.next.next;
            }else{
                curr = curr.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        LinkedListBlueprint list = new LinkedListBlueprint();
        for (int i = 1; i <= 10; i++) {
            list.addNode(i);
            list.addNode(i);
        }

        Node head = list.getHead();
        // list.printLinkedList(head);
        Node result = deleteDuplicates(head);
        list.printLinkedList(result);
    }
}
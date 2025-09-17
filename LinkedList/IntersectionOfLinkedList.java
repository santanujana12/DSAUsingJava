package LinkedList;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfLinkedList {

    public static Node getIntersection(Node headA, Node headB) {
        Node currA = headA;
        Node currB = headB;
        Set<Integer>freq = new HashSet<>();

        while(currB!=null){
            freq.add(currB.data);
            currB = currB.next;
        }
        while(currA!=null){
            if(freq.contains(currA.data)){
                return currA;
            }
            currA = currA.next;
        }
        return null;
    }

    public static void main(String[] args) {
        LinkedListBlueprint list1 = new LinkedListBlueprint();
        LinkedListBlueprint list2 = new LinkedListBlueprint();

        for (int i = 1; i <= 5; i++) {
            list1.addNode(i);
        }
        for (int i = 4; i <= 10; i++) {
            list2.addNode(i);
        }

        Node headA = list1.getHead();
        Node headB = list2.getHead();

        Node result = getIntersection(headA, headB);
        if(result!=null){
            System.out.println(result.data);
        }else{
            System.out.println("No intersection found");
        }
    }
}

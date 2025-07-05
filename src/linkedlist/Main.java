package linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.insertAtBeginning(6);
        l1.insertAtBeginning(4);
        l1.insertAtBeginning(2);
        l1.printList();

        LinkedList l2 = new LinkedList();
        l2.insertAtTheEnd(5);
        l2.insertAtBeginning(3);
        l2.insertAtBeginning(1);
        l2.insertAtBeginning(0);
        l2.insertAtBeginning(0);
        l2.printList();

        Node merged = LinkedList.mergeLists(l1.head, l2.head);
        Node curr = merged;
        while(curr!=null) {
            System.out.print(curr.data+" -> ");
            curr = curr.next;
        }
        System.out.print("Null");
        System.out.println();

        l2.rotate(2);
        l2.printList();
    }
}

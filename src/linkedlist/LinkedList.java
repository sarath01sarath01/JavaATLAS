package linkedlist;

public class LinkedList {

    Node head;

    public LinkedList() {
        this.head = null;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtBeginning(3);
        list.insertAtBeginning(2);
        list.insertAtBeginning(1);
        list.printList();

        System.out.println(list.getSize());


        list.insertAtPosition(4, 4);
        list.insertAtPosition(66, 0);
        list.insertAtPosition(22, 2);
        list.printList();

        list.insertAtTheEnd(555);
        list.printList();

        list.deleteByPosition(2);
        list.printList();

        list.deleteByValue(66);
        list.printList();

        list.removeNthNodeFromLast(2);
        list.printList();

        list.removeNthNodeFromLast(3);
        list.printList();


    }


    public void insertAtBeginning(int data) {
        if(head == null) {
            head = new Node(data);
            return;
        }
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }


    public void insertAtTheEnd(int data) {

        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void insertAtPosition(int data, int position) {
        if (position < 0) {
            System.out.println("Invalid operation");
            return;
        }
        Node newNode = new Node(data);
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node current = head;
        int count = position-1;
        for (int i = 0; i < position - 1 && current != null; i++, count--) {
            current = current.next;
        }
        if (current == null) {
            System.out.println(count);
            System.out.println("Out of Bound");
            return;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    public void deleteByValue(int data) {
        if (head == null) {
            return;
        }
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    public void deleteByPosition(int position) {
        if (head == null || position < 0) {
            System.out.println("Invalid condition");
            return;
        }

        if (position == 0) {
            head = head.next;
            return;
        }

        Node current = head;
        for (int i = 0; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null || current.next == null) {
            System.out.println("postion out of bound");
            return;
        }

        current.next = current.next.next;
    }

    public boolean search(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int getSize() {

        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }


    public void printList() {
        Node current = head;
        while (current!= null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("Null");
    }

    public void removeNthNodeFromLast(int pos) {
        Node dummy = new Node(-1);
        dummy.next = head;
        Node curr = dummy;
        for(int i=0;i<=pos;i++) {
            curr = curr.next;
        }
        Node second = dummy;
        while(curr!=null) {
            curr = curr.next;
            second = second.next;
        }

        second.next = second.next.next;
        head = dummy.next;
    }

    public static Node mergeLists(Node l1, Node l2) {

        Node merged = new Node(-1);
        Node curr = merged;
        while(l1!=null && l2!=null) {
            if(l1.data <= l2.data) {
                curr.next = new Node(l1.data);
                l1 = l1.next;
            } else {
                curr.next = new Node(l2.data);
                l2 = l2.next;
            }
            curr = curr.next;
        }
        if(l1!=null) {
            curr.next = l1;
        }
        if(l2 !=null) {
            curr.next = l2;
        }
        return merged.next;
    }

    public void rotate(int k) {
        if(head == null || k==0)
                return;
        int size = getSize();
        Node last = head;
        while(last.next!=null)
            last = last.next;

        k = k%size;
        if(k==0)
            return;
        Node newLast = head;
        for(int i=0;i<size-k-1;i++) {
            newLast = newLast.next;
        }
        Node newHead = newLast.next;
        newLast.next = null;
        last.next = head;
        head = newHead;
    }
}


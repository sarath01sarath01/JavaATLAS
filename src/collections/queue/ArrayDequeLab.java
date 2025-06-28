package collections.queue;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
public class ArrayDequeLab {
    public static void main(String[] args) {

        Deque<String> deque = new ArrayDeque<>();

        deque.addFirst("First");
        deque.addLast("Last");
        deque.offerFirst("New First");
        deque.offerLast("New Last");
        System.out.println("Deque: " + deque);

        System.out.println("First element: " + deque.getFirst());
        System.out.println("Last element: " + deque.getLast());
        System.out.println("Peek first: " + deque.peekFirst());
        System.out.println("Peek last: " + deque.peekLast());

        System.out.println("Removed first: " + deque.removeFirst());
        System.out.println("Removed last: " + deque.removeLast());
        System.out.println("Deque after removal: " + deque);

        deque.push("Stack Element 1");
        deque.push("Stack Element 2");
        System.out.println("As stack: " + deque);
        System.out.println("Popped: " + deque.pop());
//        Collections.reverseOrder()
    } }
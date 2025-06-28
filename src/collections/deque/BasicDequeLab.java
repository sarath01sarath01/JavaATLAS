package collections.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class BasicDequeLab {
    public static void main(String[] args) {

        Deque<String> deque = new ArrayDeque<>();

        deque.addFirst("Front 1");
        deque.offerFirst("Front 2");
        deque.addLast("Rear 1");
        deque.offerLast("Rear 2");
        System.out.println("Deque: " + deque);

        System.out.println("First element: " + deque.getFirst());
        System.out.println("Last element: " + deque.getLast());
        System.out.println("Peek first: " + deque.peekFirst());
        System.out.println("Peek last: " + deque.peekLast());

        System.out.println("Removed first: " + deque.removeFirst());
        System.out.println("Removed last: " + deque.removeLast());
        System.out.println("Poll first: " + deque.pollFirst());
        System.out.println("Poll last: " + deque.pollLast());

        deque.push("Stack Item 1");
        deque.push("Stack Item 2");
        System.out.println("As stack: " + deque);
        System.out.println("Popped: " + deque.pop());
    }
}

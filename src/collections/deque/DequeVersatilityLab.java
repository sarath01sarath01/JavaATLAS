package collections.deque;

import java.util.ArrayDeque;
import java.util.Deque;
public class DequeVersatilityLab {
    public static void main(String[] args) {

        Deque<String> stack = new ArrayDeque<>();
        stack.push("First");
        stack.push("Second");
        stack.push("Third");
        System.out.println("\nStack behavior:");
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }

        Deque<String> queue = new ArrayDeque<>();
        queue.offer("First");
        queue.offer("Second");
        queue.offer("Third");
        System.out.println("\nQueue behavior:");
        while (!queue.isEmpty()) {
            System.out.println("Polled: " + queue.poll());
        }

        Deque<String> hybrid = new ArrayDeque<>();
        hybrid.addFirst("Front1");
        hybrid.addLast("Rear1");
        hybrid.push("Front2");
        hybrid.offer("Rear2");
        System.out.println("\nHybrid behavior:");
        System.out.println("As stack - pop: " + hybrid.pop());
        System.out.println("As queue - poll: " + hybrid.poll());
        System.out.println("Remaining: " + hybrid);
    }
}

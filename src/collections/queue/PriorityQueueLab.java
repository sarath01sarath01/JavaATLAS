package collections.queue;

import java.util.PriorityQueue;
public class PriorityQueueLab {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(10);
        pq.add(20);
        pq.add(5);
        System.out.println("PriorityQueue elements: " + pq);
        System.out.println("Processing elements in priority order:");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }

        PriorityQueue<String> lengthPq = new PriorityQueue<>(
                (s1, s2) -> s1.length() - s2.length()
        );
        lengthPq.add("Banana");
        lengthPq.add("Apple");
        lengthPq.add("Pineapple");
        lengthPq.add("Kiwi");
        System.out.println("\nProcessing strings by length:");
        while (!lengthPq.isEmpty()) {
            System.out.println(lengthPq.poll());
        }
    } }
package collections.queue;

import java.util.LinkedList;
import java.util.Queue;
public class BasicQueueLab {
    public static void main(String[] args) {

        Queue<String> ticketQueue = new LinkedList<>();

        ticketQueue.add("Customer 1");
        ticketQueue.add("Customer 2");
        ticketQueue.offer("Customer 3");
        System.out.println("Current queue: " + ticketQueue);

        System.out.println("First in line: " + ticketQueue.peek());
        System.out.println("Queue size: " + ticketQueue.size());

        System.out.println("Processing: " + ticketQueue.remove());
        System.out.println("Processing: " + ticketQueue.poll());
        System.out.println("Queue after processing: " + ticketQueue);

        Queue<String> emptyQueue = new LinkedList<>();
        System.out.println("Peek on empty queue: " + emptyQueue.peek());

        System.out.println("Poll on empty queue: " + emptyQueue.poll());
    } }
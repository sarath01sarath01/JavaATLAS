package collections.linkedlist;

import java.util.LinkedList;

public class LinkedListLab {
    public static void main(String[] args) {
// 1. Create a LinkedList of Strings
        LinkedList<String> cities = new LinkedList<>();
// 2. Add elements
        cities.add("Paris");
        cities.add("London");
        cities.add("Tokyo");
        System.out.println("Initial list: " + cities);
// 3. Add elements at beginning and end
        cities.addFirst("New York");
        cities.addLast("Sydney");
        System.out.println("After additions: " + cities);
// 4. Access first and last elements
        System.out.println("First city: " + cities.getFirst());
        System.out.println("Last city: " + cities.getLast());
// 5. Remove elements
        cities.removeFirst();
        cities.removeLast();
//        cities.remove("London");
        System.out.println("After removals: " + cities);
// 6. Queue operations (LinkedList implements Deque)
        cities.offer("Berlin"); // adds to end
        System.out.println("After offer: " + cities);
        System.out.println("Peek (first element): " + cities.peek());
        System.out.println("Poll (remove and return first): " + cities.poll());
        System.out.println("After poll: " + cities);
// 7. Stack operations
        cities.push("Rome"); // adds to beginning
        System.out.println("After push: " + cities);
        System.out.println("Pop (remove and return first): " + cities.pop());
        System.out.println("After pop: " + cities);
    } }
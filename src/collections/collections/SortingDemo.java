package collections.collections;

import java.util.*;
public class SortingDemo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 2, 9, 1, 5, 11, 11111, 4234, 123));
        List<String> names = new ArrayList<>(Arrays.asList("Frank", "Bob", "Alice", "Charlie", "David"));

        Collections.sort(numbers);
        System.out.println("Sorted numbers: " + numbers);

        Collections.sort(names);
        System.out.println("Sorted names: " + names);

        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Reverse sorted numbers: " + numbers);

        Collections.sort(names, (a, b) -> a.length() - b.length());
        System.out.println("Sorted by length: " + names);

        Collections.sort(names, (a, b) -> a.charAt(a.length()-1) - b.charAt(b.length()-1));
        System.out.println("Sorted by last char: " + names);

        Collections.sort(names, (a, b) -> {
            if(a.charAt(a.length()-1) == b.charAt(b.length()-1))
                return b.charAt(0) - a.charAt(0);
            return a.charAt(a.length()-1) - b.charAt(b.length()-1);
        });
        System.out.println("Sorted by last char and first char: " + names);
    } }
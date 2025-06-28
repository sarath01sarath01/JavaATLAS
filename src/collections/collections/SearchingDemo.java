package collections.collections;

import java.util.*;
public class SearchingDemo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(121, 1, 221, 55, 5, 9, 312, 2344, 243));

        Collections.sort(numbers);

        System.out.println("Sorted numbers::" + numbers);

        int index = Collections.binarySearch(numbers, 5);
        System.out.println("Index of 5: " + index);

        int notFound = Collections.binarySearch(numbers, 7);
        System.out.println("Index of 7: " + notFound);
    } }

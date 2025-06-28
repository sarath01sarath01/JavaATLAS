package collections.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraySortSearch {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 5, 3123, 312, 45, 532};
        String[] names = {"Bob", "Alice", "Charlie", "Diya", "Edward", "Pogo", "Zebra"};

        Arrays.sort(numbers);
        System.out.println("Sorted numbers: " + Arrays.toString(numbers));

        Arrays.sort(names);
        System.out.println("Sorted names: " + Arrays.toString(names));

        int index = Arrays.binarySearch(numbers, 5);
        System.out.println("Index of 5: " + index);

        int notFound = Arrays.binarySearch(numbers, 7);
        System.out.println("Index of 7: " + notFound);

        index = Arrays.binarySearch(
//                Arrays.asList(names).stream().forEach(name -> name.toUpperCase()).collect(Collections.col);
                names
                , "Pogo");
        System.out.println("Index of Pogo: " + index);
    } }
package arrays;

import java.util.Arrays;

public class ArrayOperations {
    public static void main(String[] args) {
        int[] numbers = {12, 5, 27, 8, 16, 3};
// Sorting
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));
// Searching
        int key = 16;
        int index = Arrays.binarySearch(numbers, key);
        System.out.println(key + " found at index: " + index);
// Copying arrays
        int[] copy1 = Arrays.copyOf(numbers, numbers.length);
        int[] copy2 = Arrays.copyOfRange(numbers, 2, 5);
        System.out.println("Full copy: " + Arrays.toString(copy1));
        System.out.println("Range copy: " + Arrays.toString(copy2));
// Filling arrays
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 42);
        System.out.println("Filled array: " + Arrays.toString(filledArray));
// Comparing arrays
        System.out.println("Arrays equal? " + Arrays.equals(numbers, copy1));
    }
}

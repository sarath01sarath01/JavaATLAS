package collections.arrays;

import java.util.Arrays;
public class ArrayFill {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        String[] names = new String[3];


        Arrays.fill(numbers, 10);
        System.out.println("Filled array: " + Arrays.toString(numbers));

        Arrays.fill(names, 1, 3, "Unknown");
        System.out.println("Partially filled: " + Arrays.toString(names));

        Arrays.fill(numbers, 'c');
        System.out.println("Partially filled: " + Arrays.toString(numbers));
    }
}
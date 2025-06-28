package collections.collections;

import java.util.*;
public class MinMaxFrequencyDemo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 2, 9, 1, 5, 100, -100, 0, 5, 55, 5));

        int min = Collections.min(numbers);
        int max = Collections.max(numbers);
        System.out.println("Min: " + min + ", Max: " + max);

        int freq = Collections.frequency(numbers, 5);
        System.out.println("Frequency of 5: " + freq);
    }
}

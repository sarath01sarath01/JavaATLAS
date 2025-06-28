package collections.collections;

import java.util.*;
public class ShuffleReverseDemo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(11, 22, 33, 44, 55, 99, 111));

        Collections.shuffle(numbers);
        System.out.println("Shuffled: " + numbers);

        Collections.reverse(numbers);
        System.out.println("Reversed: " + numbers);
    } }
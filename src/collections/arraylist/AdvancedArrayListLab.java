package collections.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
public class AdvancedArrayListLab {
    public static void main(String[] args) {
// 1. Initialize with elements
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
// 2. Iterate using for-each
        System.out.println("Using for-each:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
// 3. Iterate using Iterator
        System.out.println("\nUsing Iterator:");
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
// 4. Sublist
        List<Integer> subList = numbers.subList(1, 4);
        System.out.println("\nSublist (1-4): " + subList);
// 5. Convert to array
        Integer[] numbersArray = numbers.toArray(new Integer[0]);
        System.out.println("Array: " + Arrays.toString(numbersArray));
// 6. Remove elements conditionally
        numbers.removeIf(n -> n > 30);
        System.out.println("After removing >30: " + numbers);
// 7. Replace all elements
        numbers.replaceAll(n -> n * 2);
        System.out.println("After doubling: " + numbers);
    } }

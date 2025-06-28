package collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListLab {
    public static void main(String[] args) {
// 1. Create an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();
// 2. Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        System.out.println("Initial list: " + fruits);
// 3. Insert element at specific position
        fruits.add(1, "Mango");
        System.out.println("After insertion: " + fruits);
// 4. Access elements
        System.out.println("Element at index 2: " + fruits.get(2));
// 5. Update element
        fruits.set(0, "Pineapple");
        System.out.println("After update: " + fruits);
// 6. Remove elements
        fruits.remove("Banana");
        fruits.remove(0);
        System.out.println("After removal: " + fruits);
// 7. Check if element exists
        System.out.println("Contains Orange? " + fruits.contains("Orange"));
// 8. Get size
        System.out.println("Size of list: " + fruits.size());
// 9. Sort the list
        Collections.sort(fruits);
        System.out.println("Sorted list: " + fruits);
// 10. Clear the list
        fruits.clear();
        System.out.println("After clear: " + fruits + ", is empty? " + fruits.isEmpty());
    } }
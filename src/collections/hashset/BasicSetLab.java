package collections.hashset;

import java.util.HashSet;
import java.util.Set;
public class BasicSetLab {
    public static void main(String[] args) {
// 1. Create a HashSet
        Set<String> programmingLanguages = new HashSet<>();
// 2. Add elements
        programmingLanguages.add("Java");
        programmingLanguages.add("Python");
        programmingLanguages.add("JavaScript");
        programmingLanguages.add("Java"); // Duplicate - won't be added
        System.out.println("Set contents: " + programmingLanguages);
// 3. Check for element existence
        System.out.println("Contains Java? " + programmingLanguages.contains("Java"));
        System.out.println("Contains C++? " + programmingLanguages.contains("C++"));
// 4. Remove elements
        programmingLanguages.remove("Python");
        System.out.println("After removal: " + programmingLanguages);
// 5. Iterate through set
        System.out.println("Iterating through set:");
        for (String language : programmingLanguages) {
            System.out.println(language);
        }
// 6. Set size and clear
        System.out.println("Set size: " + programmingLanguages.size());
        programmingLanguages.clear();
        System.out.println("Set after clear: " + programmingLanguages);
    } }
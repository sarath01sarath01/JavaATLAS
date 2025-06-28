package collections.map;

import java.util.HashMap;
import java.util.Map;
public class BasicMapOperations {
    public static void main(String[] args) {
// Create a HashMap
        Map<String, Integer> ageMap = new HashMap<>();
// Add entries
        ageMap.put("Alice", 25);
        ageMap.put("Bob", 30);
        ageMap.put("Charlie", 35);
// Get values
        System.out.println("Alice's age: " + ageMap.get("Alice"));
        System.out.println("Unknown key: " + ageMap.get("David")); // null
// Check if key exists
        System.out.println("Contains key 'Bob': " + ageMap.containsKey("Bob"));
// Check if value exists
        System.out.println("Contains value 30: " + ageMap.containsValue(30));
// Remove an entry
        ageMap.remove("Charlie");
        System.out.println("After removal: " + ageMap);
// Size and isEmpty
        System.out.println("Size: " + ageMap.size());
        System.out.println("Is empty: " + ageMap.isEmpty());
    }
}
package collections.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
// TreeMap keeps entries sorted by key
        TreeMap<String, Integer> sortedMap = new TreeMap<>();
        sortedMap.put("Orange", 2);
        sortedMap.put("Apple", 5);
        sortedMap.put("Banana", 3);
        sortedMap.put("Grape", 7);
        System.out.println("Sorted map: " + sortedMap);
// First and last keys
        System.out.println("First key: " + sortedMap.firstKey());
        System.out.println("Last key: " + sortedMap.lastKey());
// Head and tail maps
        System.out.println("Head map (before 'Grape'): " + sortedMap.headMap("Grape"));
        System.out.println("Tail map (from 'Grape'): " + sortedMap.tailMap("Grape"));
// Reverse order view
        System.out.println("Descending order: " + sortedMap.descendingMap());

    } }

package collections.hashset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
public class SetImplementationsLab {
    public static void main(String[] args) {
        String[] colors = {"Red", "Green", "Blue", "Yellow", "Orange", "Red", "Blue"};
// 1. HashSet - unordered, fastest
        Set<String> hashSet = new HashSet<>(Arrays.asList(colors));
        System.out.println("HashSet: " + hashSet);
// 2. LinkedHashSet - insertion order
        Set<String> linkedHashSet = new LinkedHashSet<>(Arrays.asList(colors));
        System.out.println("LinkedHashSet: " + linkedHashSet);
// 3. TreeSet - sorted order
        Set<String> treeSet = new TreeSet<>(Arrays.asList(colors));
        System.out.println("TreeSet: " + treeSet);
// Performance comparison
        long start = System.nanoTime();
        hashSet.contains("Orange");
        long end = System.nanoTime();
        System.out.println("HashSet lookup time: " + (end - start) + " ns");
        start = System.nanoTime();
        treeSet.contains("Orange");
        end = System.nanoTime();
        System.out.println("TreeSet lookup time: " + (end - start) + " ns");
    }
}
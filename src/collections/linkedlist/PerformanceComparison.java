package collections.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class PerformanceComparison {
    static final int SIZE = 100000;
    public static void main(String[] args) {
// ArrayList creation
        List<Integer> arrayList = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            arrayList.add(0, i); // Insert at beginning
        }
        System.out.println("ArrayList insert at beginning: " +
                (System.currentTimeMillis() - start) + "ms");
// LinkedList creation
        List<Integer> linkedList = new LinkedList<>();
        start = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            linkedList.add(0, i); // Insert at beginning
        }
        System.out.println("LinkedList insert at beginning: " +
                (System.currentTimeMillis() - start) + "ms");
// Random access comparison
        start = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i += 1000) {
            arrayList.get(i);
        }
        System.out.println("ArrayList random access: " +
                (System.currentTimeMillis() - start) + "ms");
        start = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i += 1000) {
            linkedList.get(i);
        }
        System.out.println("LinkedList random access: " +
                (System.currentTimeMillis() - start) + "ms");
    } }
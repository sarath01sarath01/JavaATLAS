package collections.sortedset;

import java.util.SortedSet;
import java.util.TreeSet;
public class BasicSortedSetLab {
    public static void main(String[] args) {

        SortedSet<Integer> numbers = new TreeSet<>();

        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(10);
        System.out.println("SortedSet: " + numbers);

        System.out.println("First element: " + numbers.first());
        System.out.println("Last element: " + numbers.last());

        SortedSet<Integer> headSet = numbers.headSet(5);
        System.out.println("HeadSet (<5): " + headSet);

        SortedSet<Integer> tailSet = numbers.tailSet(5);
        System.out.println("TailSet (>=5): " + tailSet);

        SortedSet<Integer> subSet = numbers.subSet(2, 8);
        System.out.println("SubSet (2-8): " + subSet);

        System.out.println("Comparator: " + numbers.comparator());
    } }

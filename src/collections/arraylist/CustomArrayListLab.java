package collections.arraylist;

import java.util.ArrayList;
import java.util.Comparator;
class Student {
    String name;
    int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}
public class CustomArrayListLab {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
// Add students
        students.add(new Student("Alice", 20));
        students.add(new Student("Bob", 22));
        students.add(new Student("Charlie", 19));
        System.out.println("Original list:");
        students.forEach(System.out::println);
// Sort by age using Comparator
        students.sort(Comparator.comparingInt(s -> s.age));
        System.out.println("\nSorted by age:");
        students.forEach(System.out::println);
// Sort by name
        students.sort(Comparator.comparing(s -> s.name));
        System.out.println("\nSorted by name:");
        students.forEach(System.out::println);
    } }
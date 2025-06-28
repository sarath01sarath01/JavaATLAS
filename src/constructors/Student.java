package constructors;

// Default constructor

public class Student {
    String name;
    int age;

    // Default constructor
    public Student() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Student student1 = new Student(); // Uses default constructor
        Student student2 = new Student("Alice", 20);
        System.out.println("Student 1: " + student1.name + ", " + student1.age);
        System.out.println("Student 2: " + student2.name + ", " + student2.age);
    }
}
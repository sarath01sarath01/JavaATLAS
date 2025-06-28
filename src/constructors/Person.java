package constructors;

// Copy constructor

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person original) {
        this.name = original.name;
        this.age = original.age;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Bob", 25);
        Person person2 = new Person(person1); // Copy
        System.out.println("Person 1: " + person1.name + ", " + person1.age);
        System.out.println("Person 2: " + person2.name + ", " + person2.age);
// Change person1 to show they're different objects
        person1.name = "Robert";
        System.out.println("\nAfter modification:");
        System.out.println("Person 1: " + person1.name + ", " + person1.age);
        System.out.println("Person 2: " + person2.name + ", " + person2.age);
    }
}
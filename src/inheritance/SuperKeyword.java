package inheritance;

class Person {
    String name;
    Person(String name) {
        this.name = name;
    }
    void display() {
        System.out.println("Name: " + name);
    }
}
class Student extends Person {
    int rollNo;
    Student(String name, int rollNo) {
        super(name); // calling parent constructor
        this.rollNo = rollNo;
    }
    @Override
    void display() {
        super.display(); // calling parent method
        System.out.println("Roll No: " + rollNo);
    }
}
public class SuperKeyword {
    public static void main(String[] args) {
        Student s = new Student("Alice", 101);
        s.display();
    }
}


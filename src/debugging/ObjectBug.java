package debugging;

class Student {
    String name;
    int age;

    Student() {
        this.name = "not assigned";
        this.age = -1;
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class ObjectBug {

    public static void main(String[] args) {
        Student s = new Student();
        printStudent(s);
    }

    public static void printStudent(Student s) {
        System.out.println("Name: " + s.name.toUpperCase());
    }
}
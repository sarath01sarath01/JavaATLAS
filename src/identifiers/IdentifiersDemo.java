package identifiers;

public class IdentifiersDemo {
    public static void main(String[] args) {
        int age = 25;
        double $salary = 50000.50;
        String _message = "Hello";
        int numberOfStudents = 30;
// Invalid identifiers (uncomment to see errors)
// int 2times = 2; // Error: starts with number
// double my-score = 90; // Error: contains hyphen
// String class = "OOP"; // Error: reserved keyword
        System.out.println("Valid identifiers:");
        System.out.println("age: " + age);
        System.out.println("$salary: " + $salary);
        System.out.println("_message: " + _message);
        System.out.println("numberOfStudents: " + numberOfStudents);
    }

}

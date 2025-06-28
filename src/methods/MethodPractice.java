package methods;

public class MethodPractice {
    public static void greetUser(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        greetUser("Alice");
        greetUser("Bob");
    }
}
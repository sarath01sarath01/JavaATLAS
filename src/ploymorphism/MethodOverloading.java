package ploymorphism;

// Compile-time polymorphism

class Calculator {
    // Add two integers
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Add two doubles
    double add(double a, double b) {
        return a + b;
    }

    // Concatenate two strings
    String add(String a, String b) {
        return a + b;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("10 + 20 = " + calc.add(10, 20));
        System.out.println("10 + 20 + 30 = " + calc.add(10, 20, 30));
        System.out.println("5.5 + 4.5 = " + calc.add(5.5, 4.5));
        System.out.println("Hello + World = " + calc.add("Hello", "World"));
    }
}
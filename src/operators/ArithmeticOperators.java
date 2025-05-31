package operators;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int a = 15;
        int b = 4;
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / 1.0/b)); // Division (integer)
        System.out.println("a % b = " + (a % b)); // Modulus
        System.out.println("a++ = " + (a++)); // Post-increment
        System.out.println("++b = " + (++b)); // Pre-increment
// Floating-point division
        double x = 15.0;
        double y = 4.0;
        System.out.println("x / y = " + (x / y));
        a=10;
        b=10;
        System.out.println(a * b++);
    }
}

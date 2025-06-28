package exceptionhandling;

// Method Chaining with Exceptions

public class ExceptionPropagation {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("Caught in main: " + e.getMessage());
        }
    }
    static void method1() throws Exception {
        try {
            method2();
        } catch (Exception e) {
            throw new Exception("Throwing exception from method1 with method2 message, " + e.getMessage());
        }

    }
    static void method2() throws Exception {
        throw new Exception("Exception from method2");
    } }
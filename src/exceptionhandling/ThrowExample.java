package exceptionhandling;

class UnderAgeException extends Exception {
    UnderAgeException(String msg) {
        super(msg);
    }
}

public class ThrowExample {
    public static void checkAge(int age) throws UnderAgeException {
//        if (age < 18) {
//            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
//        }
        if (age < 18) {
            throw new UnderAgeException("Access denied - You must be at least 18 years old.");
        }

        else {
            System.out.println("Access granted - You are old enough!");
        }
    }
    public static void main(String[] args) {
        try {
            checkAge(15); // This will throw an exception
        } catch (UnderAgeException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
        try {
            checkAge(20); // This will work fine
        } catch (UnderAgeException e) {
            throw new RuntimeException(e);
        }
    } }

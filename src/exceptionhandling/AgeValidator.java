package exceptionhandling;

// Creating Custom Exception

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
public class AgeValidator {
    public static void validateAge(int age) throws InvalidAgeException {
//        if (age < 0 || age > 120) {
//            throw new InvalidAgeException("Age must be between 0 and 120");
//        }
        if (age < 0) {
            throw new InvalidAgeException("Age must be above 0");
        }
        if(age > 120) {
            throw new InvalidAgeException("Age must be below 120");
        }
    }
    public static void main(String[] args) {
        try {
            validateAge(125);
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    } }
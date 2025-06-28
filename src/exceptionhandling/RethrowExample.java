package exceptionhandling;

public class RethrowExample {
    public static void processInput(String input) throws NumberFormatException {
        System.out.println("Input::" + input);
        try {
            int number = Integer.parseInt(input);
            System.out.println("Square of " + number + " is " + (number * number));
        } catch (NumberFormatException e) {
            System.out.println("First attempt failed - trying alternative...");
            try {
                double d = Double.parseDouble(input);
                System.out.println("Square of " + d + " is " + (d * d));
            } catch (NumberFormatException nfe) {
                System.out.println("Second attempt also failed");
                throw nfe;
            }

//            throw e; // re-throw the exception
        }
    }
    public static void main(String[] args) {
        try {
            processInput("123"); // valid
            processInput("123.123"); // valid
            processInput("abc"); // invalid
        } catch (NumberFormatException e) {
            System.out.println("Final error: Input must be a valid integer");
        }
    }
}

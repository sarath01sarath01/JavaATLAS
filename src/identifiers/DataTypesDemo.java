package identifiers;

public class DataTypesDemo {
    public static void main(String[] args) {
        byte myByte = 100; // 8-bit signed integer
        short myShort = 5000; // 16-bit signed integer
        int myInt = 100000; // 32-bit signed integer
        long myLong = 15000000000L; // 64-bit signed integer (note the 'L' suffix)
// Floating-point types
        float myFloat = 5.752342941f; // 32-bit floating point (note the 'f' suffix)
        double myDouble = 19.99999231414123434504934513094014345346510345454365456434614375349614382746147214d; // 64-bit floating point ('d' is optional)
// Character type
        char myChar = 'A'; // 16-bit Unicode character
// Boolean type
        boolean myBool = true; // true or false
// Display all values
        System.out.println("byte: " + myByte);
        System.out.println("short: " + myShort);
        System.out.println("int: " + myInt);
        System.out.println("long: " + myLong);
        System.out.println("float: " + myFloat);
        System.out.println("double: " + myDouble);
        System.out.println("char: " + myChar);
        System.out.println("boolean: " + myBool);
    }
}

package identifiers;

public class TypeConversion {
    public static void main(String[] args) {
        // Widening conversion (implicit)
        int myInt = 9;
        double myDouble = myInt; // Automatic conversion: int to double
        System.out.println("int: " + myInt);
        System.out.println("double after widening: " + myDouble);
// Narrowing conversion (explicit casting)
        double anotherDouble = 9.78;
        int anotherInt = (int) anotherDouble; // Manual casting: double to int
        System.out.println("double: " + anotherDouble);
        System.out.println("int after narrowing: " + anotherInt);
// Overflow example
        byte smallByte = (byte) 200; // byte range is -128 to 127
        System.out.println("Overflow example: " + smallByte);
// Character to int conversion
        char myChar = 'A';
        int charToInt = myChar;
        System.out.println("char 'A' as int: " + charToInt);
    }
}

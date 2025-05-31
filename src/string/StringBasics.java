package string;

public class StringBasics {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        String result = str1 + " " + str2;
        System.out.println("Concatenation: " + result);

        // Length
        System.out.println("Length of str1: " + str1.length());
// Character at index
        System.out.println("Character at index 1 in str1: " + str1.charAt(1));
// Substring
        System.out.println("Substring of str2 from index 1: " + str2.substring(1));
// Comparison
        System.out.println("str1 equals 'Hello': " + str1.equals("Hello"));
        System.out.println("str1 equals ignore case 'hello': " + str1.equalsIgnoreCase("hello"));
// Searching
        System.out.println("Index of 'e' in str1: " + str1.indexOf('e'));
        System.out.println("Contains 'orl' in str2: " + str2.contains("orl"));
// Case conversion
        System.out.println("Uppercase str1: " + str1.toUpperCase());
        System.out.println("Lowercase str2: " + str2.toLowerCase());
// Trimming
        String str3 = " Trim me ";
        System.out.println("Trimmed: '" + str3.trim() + "'");
// Replacement
        System.out.println("Replace 'l' with 'p' in str1: " + str1.replace('l', 'p'));
    }
}

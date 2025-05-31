package string;

public class StringReverser {
    public static String reverseWithStringBuilder(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    // Using character array
    public static String reverseWithCharArray(String str) {
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }
    // Using recursion
    public static String reverseRecursively(String str) {
        System.out.println(str);
        if (str.isEmpty()) {
            return str;
        }
        return reverseRecursively(str.substring(1)) + str.charAt(0);
    }
    public static void main(String[] args) {
        String original = "Hello World";
        System.out.println("Original: " + original);
        System.out.println("Reversed (StringBuilder): " + reverseWithStringBuilder(original));
        System.out.println("Reversed (CharArray): " + reverseWithCharArray(original));
        System.out.println("Reversed (Recursive): " + reverseRecursively(original));
    }
}

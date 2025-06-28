package recursion;

public class StringReversal {
    public static void main(String[] args) {
        String str = "reverse a string";
        System.out.println(reverse(str));
    }

    private static String reverse(String str) {
        if (str.length() == 1)
            return str.substring(0);
        return reverse(str.substring(1)) + str.charAt(0);
    }
}

package corejavapractice.basic;

public class NumberParser {
    public static void main(String[] args) {
        String x = "123";
        String y = "abc";
        System.out.println(parseNumber(x));
        System.out.println(parseNumber(y));
    }

    public static int parseNumber(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException nfe) {
            return -1;
        }
    }
}

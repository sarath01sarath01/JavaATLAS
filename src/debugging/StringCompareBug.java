package debugging;

public class StringCompareBug {
    public static void main(String[] args) {
        String s1 = "bug";
        String s2 = new String("bug");
        if (s1.equals(s2)) {
            System.out.println("Strings match");
        } else {
            System.out.println("Strings don’t match");
        }
    }
}

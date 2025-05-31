package string;

public class RotationChecker {

    public static boolean isRotation(String str1, String str2) {
        return (str1.length() == str2.length()) && ((str1 + str1).contains(str2));
    }

    public static void main(String[] args) {
        String s1 = "ABCD";
        String s2 = "CDAB";
        System.out.println(isRotation(s1, s2) ? "Rotation" : "Not Rotation");
    }
}

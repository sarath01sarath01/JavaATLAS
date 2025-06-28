package methods;

public class MethodWithReturnValue {

    public static int square(int num) {
        return num * num;
    }

    public static void main(String[] args) {
        System.out.println("Square of 5: " + square(5));
        System.out.println("Square of 12: " + square(12));
    }
}

package debugging;

public class RecursionBug {

    public static void main(String[] args) {
        int result = factorial(3);
        System.out.println("Factorial:: " + result);
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}


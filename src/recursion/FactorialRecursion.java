package recursion;

public class FactorialRecursion {

    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println(number + " factorial is:: " + factorial(number));
    }
}

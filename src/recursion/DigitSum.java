package recursion;

public class DigitSum {

    public static int sum(int n) {
        if (n < 10) {
            return n;
        }
        return n % 10 + sum(n / 10);
    }
    public static void main(String[] args) {
        int n = 1001001;
        System.out.println(sum(n));
    }
}

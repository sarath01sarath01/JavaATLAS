package recursion;

public class Power {
    public static void main(String[] args) {
        int b = 10;
        int e = -3;
        if(e>=0)
            System.out.println(power(b, e));
        else
            System.out.println(1.0/power(b, -e));
    }

    private static double power(int b, int e) {
        if(e <= 0) {
            return 1;
        }
        return b * power(b, e-1);
    }
}

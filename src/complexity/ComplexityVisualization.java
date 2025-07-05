package complexity;

public class ComplexityVisualization {
    public static void main(String[] args) {
        System.out.println("n\tlog n\tn\tn log n\tn²\tn³\t2ⁿ\tn!");
        for (int n = 1; n <= 10; n++) {
            System.out.printf("%d\t%.1f\t%d\t%.1f\t%d\t%d\t%d\t%d%n",
                    n,
                    Math.log(n),
                    n,
                    n * Math.log(n),
                    n * n,
                    n * n * n,
                    (int) Math.pow(2, n),
                    factorial(n));
        }
    }
    private static int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    } }

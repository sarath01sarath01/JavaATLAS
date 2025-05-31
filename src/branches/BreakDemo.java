package branches;

public class BreakDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
// Breaking nested loops with label
        outerLoop:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println(i + "," + j);
                if (i == 2 && j == 2) {
                    break outerLoop;
                }
            }
        }
    }
}

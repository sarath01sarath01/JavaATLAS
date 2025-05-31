package loops;

public class WhileLoopDemo {
    public static void main(String[] args) {
        // Basic while loop
        int count = 1;
        while (count <= 5) {
            System.out.println("Count: " + count);
            count++;
        }
// While with condition
        int number = 1234;
        int digits = 0;
        int temp = number;
        while (temp != 0) {
            temp /= 10;
            digits++;
        }
        System.out.println(number + " has " + digits + " digits");
    }
}

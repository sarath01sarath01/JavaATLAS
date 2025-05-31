package loops;

import java.util.Scanner;

public class DoWhileDemo {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println("Count: " + i);
            i++;
        } while (i <= 5);
// Menu system example
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Option 1");
            System.out.println("2. Option 2");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1 : System.out.println("Option 1 selected");
                case 2 : System.out.println("Option 2 selected");
                case 3 : System.out.println("Exiting...");
                default : System.out.println("Invalid choice");
            }
        } while (choice != 3);
    }
}

package practical.applications;

import java.util.Scanner;

public class MenuDrivenCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        int choice;
        do {
            System.out.println("\nCalculator Menu");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter first number: ");
                num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();
                switch (choice) {
                    case 1 -> System.out.println("Result: " + (num1 + num2));
                    case 2 -> System.out.println("Result: " + (num1 - num2));
                    case 3 -> System.out.println("Result: " + (num1 * num2));
                    case 4 -> {
                        if (num2 != 0) {
                            System.out.println("Result: " + (num1 / num2));
                        } else {
                            System.out.println("Error: Division by zero");
                        }
                    }
                }
            } else if (choice != 5) {
                System.out.println("Invalid choice");
            }
        } while (choice != 5);
        System.out.println("Calculator closed");
    }
}

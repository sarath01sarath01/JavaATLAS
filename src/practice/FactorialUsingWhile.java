package practice;

import java.util.Scanner;

public class FactorialUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int originalNumber = sc.nextInt();
        int number = originalNumber;

        int factorial = 1;
        while(number >= 2) {
            factorial *= number;
            number--;
        }

        System.out.printf("Factorial of %d = %d", originalNumber, factorial);
    }
}

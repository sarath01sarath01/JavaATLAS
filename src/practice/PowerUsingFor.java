package practice;

import java.util.Scanner;

public class PowerUsingFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a base: ");
        int base = sc.nextInt();
        System.out.print("Enter a exponent: ");
        int exponent = sc.nextInt();
        int result = 1;
        for (int i = 1; i <= exponent ; i++) {
            result *= base;
        }
        System.out.printf("%d ^ %d = %d", base, exponent, result);
    }
}

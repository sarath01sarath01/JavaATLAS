package practice;

import java.util.Scanner;

public class PowerUsingPow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a base: ");
        int base = sc.nextInt();
        System.out.print("Enter a exponent: ");
        int exponent = sc.nextInt();
        double result = Math.pow(base, exponent);
        System.out.printf("%d ^ %d = %.0f", base, exponent, result);
    }
}
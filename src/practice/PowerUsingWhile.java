package practice;

import java.util.Scanner;

public class PowerUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a base: ");
        int base = sc.nextInt();
        System.out.print("Enter a exponent: ");
        int exponent = sc.nextInt();
        int i=1;
        int result = 1;
        if(exponent > 0) {
            while(i<=exponent) {
                result *= base;
                i++;
            }
        }
        System.out.printf("%d ^ %d = %d", base, exponent, result);
    }
}

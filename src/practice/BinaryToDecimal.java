package practice;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        long binaryNumber = sc.nextLong();
        long decimalNumber = 0;

        for(int i=1; binaryNumber > 0; binaryNumber /= 10, i*=2) {
            decimalNumber += (binaryNumber%10) * i;
        }

        System.out.println("Decimal number: " + decimalNumber);
    }
}

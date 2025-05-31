package practice;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        long decimalNumber = sc.nextLong();
        long binaryNumber = 0;
        long tens = 1;
        while(decimalNumber > 0) {
            binaryNumber += (decimalNumber % 2) * tens;
            decimalNumber /= 2;
            tens *= 10;
        }
        System.out.println("Binary number: " + binaryNumber);
    }
}

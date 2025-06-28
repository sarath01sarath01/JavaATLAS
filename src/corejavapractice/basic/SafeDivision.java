package corejavapractice.basic;

import java.util.Scanner;

public class SafeDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number::");
        int x = sc.nextInt();
        System.out.print("Enter second number::");
        int y = sc.nextInt();
        try {
            int result = x/y;
            System.out.println("result::"+ result);
        } catch (ArithmeticException ae) {
            System.out.println("-1, Cannot divide by zero");
        }

    }
}

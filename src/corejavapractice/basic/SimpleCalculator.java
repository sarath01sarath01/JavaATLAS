package corejavapractice.basic;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int first = sc.nextInt();
        System.out.print("Enter second number:");
        int second = sc.nextInt();
        System.out.print("Enter operation (+ or - or * or /):");
        String operator = sc.next();
        int result = 0;
        switch (operator) {
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                result = first / second;
                break;
            default:
                System.out.println("Invalid operator");
        }
        System.out.println("Result::"+result);
    }
}

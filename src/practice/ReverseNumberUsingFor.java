package practice;

import java.util.Scanner;

public class ReverseNumberUsingFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int reverseNumber = 0;

        for(;number>0;number /= 10) {
            reverseNumber = reverseNumber * 10 + number % 10;
        }

        System.out.println("Reversed number: " + reverseNumber);

    }
}
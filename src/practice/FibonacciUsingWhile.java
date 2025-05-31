package practice;

import java.util.Scanner;

public class FibonacciUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int first = 0, second = 1;
        System.out.print("Fibonacci series:: " + first + " " + second);
        int i = 2;
        while(i < number) {
            int next = first + second;
            System.out.print(" " + next);
            first = second;
            second = next;
            i++;
        }
    }
}

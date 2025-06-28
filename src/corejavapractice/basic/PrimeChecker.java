package corejavapractice.basic;

import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        if(num%2==0) {
            System.out.println(num+" is not a prime number");
            return;
        }

        for(int i=3;i<=(int)Math.sqrt(num);i+=2) {
            if(num%i==0) {
                System.out.println(num+" is not a prime number");
                return;
            }
        }

        System.out.println(num+" is a prime number");

    }
}

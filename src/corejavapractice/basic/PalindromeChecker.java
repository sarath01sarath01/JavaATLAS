package corejavapractice.basic;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string:");
        String str = sc.next();
        int l = 0, r = str.length()-1;
        while(l<r) {
            if(str.charAt(l) != str.charAt(r)) {
                System.out.println(str+ " is not a palindrome");
                return;
            }
            l++;
            r--;
        }
        System.out.println(str+ " is a palindrome");
    }
}



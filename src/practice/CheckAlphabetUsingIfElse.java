package practice;

import java.util.Scanner;

public class CheckAlphabetUsingIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char c = sc.next().charAt(0);

        if((c >= 'a' && c <= 'z') ||  (c >= 'A' && c <= 'Z')) {
            System.out.println(c + " is an alphabet");
        } else {
            System.out.println(c + " is not an alphabet");
        }

    }
}

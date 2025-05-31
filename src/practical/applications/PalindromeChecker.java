package practical.applications;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Check for palindrome");
            System.out.println("2. Exit");
            System.out.print("Select an option: ");
            int option = sc.nextInt();
            boolean exit = false;
            switch (option) {
                case 1:
                    System.out.print("Enter a string: ");
                    String str = sc.next();
                    boolean isPalindrome = true;

                    for (int i = 0; i < str.length() / 2; i++) {
                        if (str.charAt(i) != str.charAt(str.length() - i- 1)) {
                            isPalindrome = false;
                            break;
                        }
                    }

                    System.out.println(str + " is " + (isPalindrome ? "" : "not ") + "a palindrome");
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Exiting...");
                    System.out.println();
                    exit = true;
            }

            if(exit)
                break;

        }

    }
}

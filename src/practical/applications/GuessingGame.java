package practical.applications;

import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int secretNumber = random.nextInt(1000) + 1;
        int attempts = 0;
        boolean guessed = false;
        System.out.println("Guess a number between 1 and 1000");
        while (!guessed) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;
            if (guess == secretNumber) {
                guessed = true;
                System.out.println("Correct! You guessed it in " + attempts + " attempts");
            } else if (guess < secretNumber) {
                System.out.println("Too low, try again");
            } else {
                System.out.println("Too high, try again");
            }
        }
    }
}

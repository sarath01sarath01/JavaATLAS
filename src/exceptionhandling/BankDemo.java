package exceptionhandling;

public class BankDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        try {
            account.withdraw(1500); // This will throw InsufficientFundsException
        } catch (IllegalArgumentException | InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            account.withdraw(-100); // This will throw IllegalArgumentException
        } catch (IllegalArgumentException | InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            account.withdraw(500); // This should work
        } catch (IllegalArgumentException | InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            account.deposit(500); // This should work
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    } }

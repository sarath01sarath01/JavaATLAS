package corejavapractice.basic;

public class SimpleBankAccount {
    private int accountNumber;
    private String accountHolder;
    private int balance;

    public SimpleBankAccount(int accountNumber, String accountHolder, int balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public boolean deposit(int amount) {
        if(amount>0) {
            this.balance += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(int amount) {
        if(amount<=this.balance) {
            this.balance -= amount;
            return true;
        }
        return false;
    }

    public int getBalance() {
        return this.balance;
    }

    public static void main(String[] args) {
        SimpleBankAccount sba = new SimpleBankAccount(12345, "User1", 1000);
        boolean result = sba.deposit(100);
        if(result) {
            System.out.println("deposit successful");
        }

        result = sba.withdraw(200);
        if(result) {
            System.out.println("withdraw successful");
        } else {
            System.out.println("withdraw failed");
        }

        System.out.println("Current balance::"+sba.getBalance());

    }
}



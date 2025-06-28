package ploymorphism;

interface Payment {
    void pay(double amount);
}
class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " via Credit Card");
    }
}
class PayPalPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " via PayPal");
    }
}
class BankTransferPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " via Bank Transfer");
    }
}
public class Interfaces {
    public static void main(String[] args) {
        Payment payment = new CreditCardPayment();
        payment.pay(100.0);
        payment = new PayPalPayment();
        payment.pay(200.0);
        payment = new BankTransferPayment();
        payment.pay(300.0);
    }
}

package inheritance;

abstract class Bank {
    abstract int getRateOfInterest();
}
class SBI extends Bank {
    @Override
    int getRateOfInterest() {
        return 7;
    }
}
class PNB extends Bank {
    @Override
    int getRateOfInterest() {
        return 8;
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        Bank b1 = new SBI();
        Bank b2 = new PNB();
        System.out.println("SBI Rate: " + b1.getRateOfInterest() + "%");
        System.out.println("PNB Rate: " + b2.getRateOfInterest() + "%");
    }
}

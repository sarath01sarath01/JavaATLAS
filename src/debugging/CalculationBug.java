package debugging;

public class CalculationBug {
    public static void main(String[] args) {
        int result = calculateDiscount(1000, 50);
        System.out.println("Discounted price: " + result);
    }
    public static int calculateDiscount(int price, int
            discountPercent) {
        return (int) (price - (discountPercent * 1.0 / 100) * price);
    }
}


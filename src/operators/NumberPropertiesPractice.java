package operators;

public class NumberPropertiesPractice {
    public static void main(String[] args) {
        int number = 12;
        boolean isEven = (number % 2) == 0;
        boolean isPositive = number > 0;
        boolean divisibleBy3 = (number % 3) == 0;
        System.out.println(number + " is even: " + isEven);
        System.out.println(number + " is positive: " + isPositive);
        System.out.println(number + " is divisible by 3: " + divisibleBy3);
    }
}

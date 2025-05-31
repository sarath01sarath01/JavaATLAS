package operators;

public class OperatorPrecedence {
    public static void main(String[] args) {
        int result1 = 5 + 3 * 2; // Multiplication before addition
        int result2 = (5 + 3) * 2; // Parentheses change order
        boolean result3 = 5 > 3 && 2 < 4 || 1 == 0;
        System.out.println("5 + 3 * 2 = " + result1);
        System.out.println("(5 + 3) * 2 = " + result2);
        System.out.println("5 > 3 && 2 < 4 || 1 == 0 = " + result3);
// Complex expression
        int a = 2, b = 3, c = 4;
        int complexResult = (a++) * (--b) + c / a;
        System.out.println("a++ * --b + c / a = " + complexResult);
    }

}

package methods;

public class MethodWithMultipleParameters {
    public static double calculateArea(double length, double width) {
        return length * width;
    }

    public static void main(String[] args) {
        System.out.println("Area of 4x5 rectangle: " + calculateArea(4, 5));
        System.out.println("Area of 7.5x3.2 rectangle: " + calculateArea(7.5, 3.2));
    }
}

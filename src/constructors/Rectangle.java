package constructors;

// Constructor overloading

public class Rectangle {
    double length;
    double width;

    // No-arg constructor (creates a unit square)
    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    // Constructor for square
    public Rectangle(double side) {
        this.length = side;
        this.width = side;
    }

    // Constructor for rectangle
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(); // Unit square
        Rectangle rect2 = new Rectangle(5.0); // Square
        Rectangle rect3 = new Rectangle(4.0, 6.0); // Rectangle
        System.out.println("Area 1: " + rect1.calculateArea());
        System.out.println("Area 2: " + rect2.calculateArea());
        System.out.println("Area 3: " + rect3.calculateArea());
    }
}
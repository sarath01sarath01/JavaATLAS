package corejavapractice.basic;

public class Rectangle {
    private int width, height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return this.width * this.height;
    }

    public int getPerimeter() {
        return 2 * (this.width + this.height);
    }

    public boolean isSquare() {
        return this.width == this.height;
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(10, 20);
        System.out.println("Area of rectangle1::" + rectangle1.getArea());
        System.out.println("Perimeter of rectangle1::" + rectangle1.getPerimeter());
        System.out.println("rectangle1 is a square::" + rectangle1.isSquare());
        System.out.println();
        Rectangle rectangle2 = new Rectangle(20, 20);
        System.out.println("Area of rectangle2::" + rectangle2.getArea());
        System.out.println("Perimeter of rectangle2::" + rectangle2.getPerimeter());
        System.out.println("rectangle2 is a square::" + rectangle2.isSquare());
    }
}


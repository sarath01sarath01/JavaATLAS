package inheritance;

class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}
class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a square");
    }
}
public class HierarchicalInheritance {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Square();
        s1.draw();
        s2.draw();
    }
}

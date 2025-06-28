package inheritance;

class Grandparent {
    Grandparent() {
        System.out.println("Gparent");
    }
    void grandparentMethod() {
        System.out.println("Grandparent's method");
    }
}
class Parent extends Grandparent {
    Parent() {
        System.out.println("Parent");
    }
    void parentMethod() {
        System.out.println("Parent's method");
    }
}
class Child extends Parent {
    Child() {
        System.out.println("Child");
    }
    void childMethod() {
        System.out.println("Child's method");
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.childMethod();
        obj.parentMethod();
        obj.grandparentMethod();
    }
}



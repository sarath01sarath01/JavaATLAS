package constructors;

// Object Array Initialiazation

public class Product {
    String name;
    double price;
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public void display() {
        System.out.println(name + ": $" + price);
    }
    public static void main(String[] args) {
// Create array of Products
        Product[] products = new Product[3];
// Initialize objects
        products[0] = new Product("Laptop", 999.99);
        products[1] = new Product("Phone", 699.99);
        products[2] = new Product("Tablet", 399.99);
// Display all products
        for (Product p : products) {
            p.display();
        }
    } }
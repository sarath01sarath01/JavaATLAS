package constructors;

// Basic constructor

public class Book {
    String title;
    String author;
    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "John Doe");
        Book book2 = new Book("Python Basics", "Jane Smith");
        System.out.println("Book 1: " + book1.title + " by " + book1.author);
        System.out.println("Book 2: " + book2.title + " by " + book2.author);
    }
}

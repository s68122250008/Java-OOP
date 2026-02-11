package Exerise;

// Practice constructor
public class Book {
    String title;
    String author;
    double price;

    // Default Contructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public Book(String title, String author) {
        this(title, author, 0.0);
    }

    public Book(String title) {
        this(title, "unknown", 0.0);
    }

    public Book() {
        this("unknown", "unknown", 0.0);
    }

    // Method Display
    void showInfo() {
        System.out.println("Title: " + this.title + " Author: " + this.author + " Price: " + this.price);
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "John", 250);
        Book b2 = new Book("OOP", "Anna");
        Book b3 = new Book();

        b1.showInfo();
        b2.showInfo();
        b3.showInfo();
    }
}

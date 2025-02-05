package com.wipro.java.oops;

// Abstract class representing a general Book
abstract class Book {
    private String bookTitle;
    private String bookAuthor;
    private int bookPrice;
    
    // Constructor to initialize the book
    public Book(String bookTitle, String bookAuthor, int bookPrice) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookPrice = bookPrice;
    }

    // Abstract method to be implemented by subclasses
    abstract void displayDetails(); // Abstract method

    // Getter methods
    public String getTitle() {
        return bookTitle;
    }

    public String getAuthor() {
        return bookAuthor;
    }
    
    public int getPrice() {
        return bookPrice;
    }
    
    // Setter methods to modify book details
    public void setTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public void setPrice(int bookPrice) {
        this.bookPrice = bookPrice;
    }
}

// Fiction class extends Book and provides implementation for abstract method
class Fiction extends Book {

    public Fiction(String bookTitle, String bookAuthor, int bookPrice) {
        super(bookTitle, bookAuthor, bookPrice);
    }

    @Override
    void displayDetails() {
        // Displaying details of the Fiction book
        System.out.println("Fiction Book: " + getTitle() + " by " + getAuthor() + " | Price: $" + getPrice());
    }
}

// NonFiction class extends Book and provides implementation for abstract method
class NonFiction extends Book {

    public NonFiction(String bookTitle, String bookAuthor, int bookPrice) {
        super(bookTitle, bookAuthor, bookPrice);
    }

    @Override
    void displayDetails() {
        // Displaying details of the NonFiction book
        System.out.println("Non-Fiction Book: " + getTitle() + " by " + getAuthor() + " | Price: $" + getPrice());
    }
}

public class Oops {
    public static void main(String[] args) {
        // Creating objects of subclasses (Polymorphism)
        Book book1 = new Fiction("The Great Gatsby", "F. Scott Fitzgerald", 200);
        Book book2 = new NonFiction("Sapiens: A Brief History of Humankind", "Yuval Noah Harari", 500);
        
        // Displaying initial details of books
        book1.displayDetails();
        book2.displayDetails();
    }
}

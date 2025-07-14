package OOPS.Part4.libraryandbooks;

import java.util.ArrayList;

public class Library {
    private String name;
    private ArrayList<Book> books;

    // Constructor
    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    // Add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Display library books
    public void displayBooks() {
        System.out.println("Books in " + name + " Library:");
        for (Book book : books) {
            book.displayInfo();
        }
    }
}

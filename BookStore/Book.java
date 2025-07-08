package farwy;

public abstract class Book {
    protected String isbn; // Unique identifier for the book
    protected String title; // Title of the book
    protected int year; // Year of publication
    protected double price; // Price of the book

    public Book(String isbn, String title, int year, double price) {
        this.isbn = isbn; // Set the ISBN
        this.title = title; // Set the title
        this.year = year; // Set the year
        this.price = price; // Set the price
    }

    public String getIsbn() {
        return this.isbn; // Return the ISBN
    }

    public int getYear() {
        return this.year; // Return the year of publication
    }

    public String gettitle() {
        return this.title; // Return the title
    }

    public abstract double buy(int quantity, String email, String address) throws Exception; // Abstract method for purchasing
}

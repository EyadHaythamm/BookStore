package farwy;

public class Main {
    public static void main(String[] args) {
        try {
            BookStore store = new BookStore(); // Create a new bookstore instance

            // Add books to the bookstore
            store.addBook(new PaperBook("1234", "Book 1", 2020, 100.0, 10));
            store.addBook(new EBook("4567", "Book 2", 2022, 50.0, "PDF"));
            store.addBook(new DemoBook("7890", "Book 3", 2018));

            // Purchase books and print the total paid
            store.buyBook("1234", 2, "eyad@gmail.com", "6 october");
            store.buyBook("4567", 1, "eyad@gmail.com", null);

            // Remove outdated books from the inventory
            store.removeOutdatedBooks(2025, 5);

            // Attempt to purchase a demo book (will throw an exception)
            store.buyBook("7890", 1, "eyad@gmail.com", "6 october");
        } catch (Exception e) {
            // Handle any exceptions that occur during the process
            System.out.println("Error: " + e.getMessage());
        }
    }
}

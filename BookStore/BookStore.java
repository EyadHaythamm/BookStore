package farwy;

import java.util.*;

public class BookStore {
    private Map<String, Book> inventory = new HashMap<>(); // Store books by their ISBN

    public void addBook(Book book) {
        inventory.put(book.getIsbn(), book); // Add a book to the inventory
    }

    public void removeOutdatedBooks(int currentYear, int maxAge) {
        Iterator<Map.Entry<String, Book>> iterator = inventory.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Book> entry = iterator.next();
            // Remove books older than the specified maximum age
            if (currentYear - entry.getValue().getYear() > maxAge) {
                iterator.remove();
                System.out.println("==== Removed Outdated Book ====");
                System.out.println("ISBN: " + entry.getKey());
                System.out.println("Title: " + entry.getValue().gettitle());
                System.out.println("===============================");
            }
        }
    }

    public double buyBook(String isbn, int quantity, String email, String address) throws Exception {
        // Check if the book exists in the inventory
        if (!inventory.containsKey(isbn)) {
            throw new Exception("Purchase failed: Book not found with ISBN: " + isbn);
        }
        Book book = inventory.get(isbn); // Retrieve the book
        double totalCost = book.buy(quantity, email, address); // Process the purchase
        System.out.println("==== Purchase Successful ====");
        System.out.println("Book: " + book.gettitle());
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: $" + totalCost);
        System.out.println("Total Paid: $" + totalCost);
        System.out.println("=============================");
        return totalCost;
    }
}


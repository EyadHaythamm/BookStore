package farwy;

public class PaperBook extends Book {
    private int stock; // Number of copies available in stock

    public PaperBook(String isbn, String title, int year, double price, int stock) {
        super(isbn, title, year, price); // Initialize the base class
        this.stock = stock; // Set the stock
    }

    @Override
    public double buy(int quantity, String email, String address) throws Exception {
        // Check if there is enough stock to fulfill the order
        if (quantity > stock) {
            throw new Exception("Not enough stock for book " + isbn);
        }
        stock -= quantity; // Reduce the stock by the purchased quantity
        ShippingService.send(this, address); // Ship the book to the provided address
        return price * quantity; // Return the total price
    }
}

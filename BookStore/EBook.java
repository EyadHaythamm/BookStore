package farwy;

public class EBook extends Book {
    private String type; // Format of the eBook (e.g., PDF, EPUB)

    public EBook(String isbn, String title, int year, double price, String type) {
        super(isbn, title, year, price); // Initialize the base class
        this.type = type; // Set the eBook type
    }
    public String getType() {
        return this.type; // Return the type of the eBook
    }
    @Override
    public double buy(int quantity, String email, String address) throws Exception {
        // Ensure only one eBook can be purchased at a time
        if (quantity != 1) {
            throw new Exception("Only one eBook can be purchased at a time.");
        }
        MailService.send(this, email); // Send the eBook to the user's email
        return price; // Return the price of the eBook
    }
}

package farwy;

// DemoBook class extends the Book class
public class DemoBook extends Book {
    public DemoBook(String isbn, String title, int year) {
        super(isbn, title, year, 0.0); // Initialize the base class with a price of 0.0
    }

    @Override
    public double buy(int quantity, String email, String address) throws Exception {
        // Throw an exception since demo books cannot be purchased
        throw new Exception("Demo Books are not for Sale!!");
    }
}

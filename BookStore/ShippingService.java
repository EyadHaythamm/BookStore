package farwy;

public class ShippingService {
    // Method to handle shipping of paper books
    public static void send(PaperBook book, String address) {
        System.out.println("Shipping paper book " + book.gettitle() + " to " + address);
    }
}

package farwy;

public class MailService {
    // Method to send an eBook to the user's email
    public static void send(EBook book, String email) {
        System.out.println("Sending eBook " + book.title + " to " + email);
    }
}

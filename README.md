# BookStore application
The `BookStore` class is a simple Java implementation of a bookstore inventory and sales system. It allows you to manage a collection of books, remove outdated books, and process book purchases.

## Class Details

### `addBook(Book book)`
- Adds a book to the inventory.
- The book is stored using its ISBN as the key.

### `removeOutdatedBooks(int currentYear, int maxAge)`
- Removes books from the inventory that are older than the specified maximum age.
- Outputs detailed information about each removed book, including its ISBN and title.

### `buyBook(String isbn, int quantity, String email, String address)`
- Processes the purchase of a book.
- Checks if the book exists in the inventory.
- Calculates the total cost of the purchase.
- Outputs detailed purchase information, including the book title, quantity, and total cost.

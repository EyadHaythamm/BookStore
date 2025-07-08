# BookStore Application

## Overview
This application is a Java-based project that simulates a bookstore system. It demonstrates object-oriented programming principles by implementing various types of books, inventory management, and purchase handling. The application includes features for managing physical and digital books, shipping, and user interaction.

## Features

### 1. Book Management
- **Add Books**: Add different types of books (`PaperBook`, `EBook`, `DemoBook`) to the inventory.
- **Remove Outdated Books**: Automatically remove books older than a specified maximum age.
- **Purchase Books**: Handle the purchase of books with detailed output and validation.

### 2. Book Types
- **PaperBook**: Represents physical books with stock management and shipping functionality.
- **EBook**: Represents digital books with email delivery.
- **DemoBook**: Represents demo books that cannot be purchased.

### 3. Services
- **ShippingService**: Handles the shipping of physical books to a specified address.
- **MailService**: Handles the delivery of eBooks to a user's email.

### 4. User Interaction
- Provides clear and formatted output for actions like adding books, removing outdated books, and purchasing books.
- Uses exceptions to handle errors, such as attempting to purchase a book with insufficient stock or a demo book.

## Components

### `Book` Class
An abstract base class representing a book. It includes attributes like ISBN, title, year, and price, and defines an abstract `buy` method for purchasing.

### `PaperBook` Class
Extends the `Book` class to represent physical books. It includes:
- Stock management.
- Integration with the `ShippingService` for delivery.

### `EBook` Class
Extends the `Book` class to represent digital books. It includes:
- A type attribute (e.g., PDF, EPUB).
- Integration with the `MailService` for email delivery.

### `DemoBook` Class
Extends the `Book` class to represent demo books. These books cannot be purchased and throw an exception if a purchase is attempted.

### `BookStore` Class
Manages the inventory of books and provides methods for:
- Adding books.
- Removing outdated books.
- Processing book purchases.

### `ShippingService` Class
Handles the shipping of `PaperBook` instances to a specified address.

### `MailService` Class
Handles the delivery of `EBook` instances to a user's email.

### `Main` Class
The entry point of the application. Demonstrates the functionality of the bookstore system by:
- Adding books to the inventory.
- Removing outdated books.
- Purchasing books.
- Handling exceptions for invalid operations.

# Library System Design Patterns

This project is a Java-based Library System that demonstrates the implementation of multiple Design Patterns.

## Implemented Design Patterns

1. **Singleton**
   - Ensures that only one instance of `LibraryService` exists in the system.

2. **Factory**
   - `BookFactory` is used to create different types of books such as:
     - EBook
     - PhysicalBook
     - HistoricalBook

3. **Decorator**
   - `PremiumBookDecorator` adds an extra 10 days for borrowing without modifying the original `Book` class.

4. **Proxy**
   - `PremiumEBookProxy` restricts access to EBooks so that only premium users can borrow them.

5. **Chain of Responsibility**
   - Borrowing requests go through:
     - Librarian
     - Manager

6. **Facade**
   - `LibraryFacade` simplifies the borrowing and returning operations by hiding the internal workflow.

7. **Adapter**
   - `BookAdapter` converts external book data into the system's `Book` entity.

8. **Observer**
   - `NotifiableBook` notifies registered users when a book becomes available.

## Project Features

- Add books to the library
- Borrow and return books
- Support premium books
- Restrict premium eBook access
- Handle borrowing approval flow
- Adapt external book data
- Notify users when books are available

## Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Design Patterns

## Author

Mohamed Tarek

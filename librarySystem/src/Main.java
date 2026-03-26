public class Main {
    public static void main(String[] args) {


        LibraryService alexLibrary = LibraryService.getInstance();


        User user = new User("John", true);
        User premiumUser = new User("John", true);
        User normalUser = new User("Ali", false);


        Book b1 = BookFactory.createBook("ebook", "Java Basics");
        Book b2 = BookFactory.createBook("physical", "Clean Code");
        Book b3 = BookFactory.createBook("historical", "Ancient Egypt");

        alexLibrary.addBook(b1);
        alexLibrary.addBook(b2);
        alexLibrary.addBook(b3);

        // =========================
        // Task 3: Decorator
        // PremiumBook adds extra 10 days without modifying Book
        // =========================
        Book normalBook = new Book("SOLID Principles");
        Book premiumBook = new PremiumBookDecorator(new Book("Design Patterns"));

        alexLibrary.addBook(normalBook);
        alexLibrary.addBook(premiumBook);

        alexLibrary.borrowBook("SOLID Principles", user);
        alexLibrary.borrowBook("Design Patterns", user);

        // =========================
        // Task 4: Proxy
        // Premium access for EBooks
        // =========================
        Book premiumEbook = new PremiumEBookProxy(new EBook("Java Mastery"));
        alexLibrary.addBook(premiumEbook);

        alexLibrary.borrowBook("Java Mastery", premiumUser);
        alexLibrary.borrowBook("Java Mastery", normalUser);  

        // =========================
        // Task 5: Chain of Responsibility
        // Borrowing request goes through Librarian -> Manager
        // =========================
        Approver librarian = new Librarian();
        Approver manager = new Manager();

        librarian.setNextApprover(manager);

        BorrowRequest request = new BorrowRequest(user, normalBook, 5);
        librarian.handleRequest(request);

        // =========================
        // Task 6: Facade
        // Simplify library borrowing operations
        // =========================
        LibraryFacade libraryFacade = new LibraryFacade();

        libraryFacade.addBook(new Book("mohamed tarek"));
        libraryFacade.addBook(new PremiumBookDecorator(new Book("Refactoring")));
        libraryFacade.addBook(new PremiumEBookProxy(new EBook("Java Core")));

        libraryFacade.borrowBook("mohamed tarek", user, 5);
        libraryFacade.borrowBook("Refactoring", user, 7);
        libraryFacade.borrowBook("Java Core", user, 3);

        libraryFacade.returnBook("Java Core");

        // =========================
        // Task 7: Adapter
        // Convert external JSON-like book data to our Book entity
        // =========================
        ExternalBookData externalData =new ExternalBookData("Patterns of Enterprise Application Architecture", true, "Martin Fowler", 2002);

        Book adaptedBook = new BookAdapter(externalData);
        alexLibrary.addBook(adaptedBook);

        alexLibrary.borrowBook("Patterns of Enterprise Application Architecture", user);

         // =========================
        // Task 8: Observer
        // Notify users when books become available
        // =========================
        NotifiableBook observerBook = new NotifiableBook("Clean Architecture");
        alexLibrary.addBook(observerBook);
        observerBook.addObserver(user);
        observerBook.addObserver(normalUser);
        observerBook.returnBook();
    }لفه
    }
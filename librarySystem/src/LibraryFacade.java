public class LibraryFacade {
    private LibraryService libraryService;
    private Approver approverChain;

    public LibraryFacade()
    {
        libraryService = LibraryService.getInstance();
        Approver librarian = new Librarian();
        Approver manager = new Manager();
        librarian.setNextApprover(manager);
        approverChain = librarian;
    }

    public void borrowBook(String title, User user, int days)
    {
        Book book= libraryService.findBook(title);
        if (book == null) {
        System.out.println("Book not found.");
        return;
        }
    BorrowRequest request = new BorrowRequest(user, book, days);
    approverChain.handleRequest(request);  
    }
    public void returnBook(String title) {
        Book book = libraryService.findBook(title);

        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        book.returnBook();
    }
    
    public void addBook(Book book) {
        libraryService.addBook(book);
    }
}

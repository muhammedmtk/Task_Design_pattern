public class BookAdapter extends Book {
    private ExternalBookData externalBookData;

    public BookAdapter(ExternalBookData externalBookData) 
    {
        super(externalBookData.getBookTitle());
        this.externalBookData = externalBookData;
    }

    @Override
    public boolean isAvailable() 
    {
    return externalBookData.isBorrowable();
    }

    @Override
    public void borrowBook(User user)
    {
        if (externalBookData.isBorrowable()) {
        System.out.println(user.getName() + " borrowed external book: " + externalBookData.getBookTitle());
    } else {
        System.out.println("External book is not available for borrowing.");
    }
    }

    @Override
    public void returnBook() {
    System.out.println("External book returned: " + externalBookData.getBookTitle());
}
}

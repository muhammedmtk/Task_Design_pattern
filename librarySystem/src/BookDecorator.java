public abstract class BookDecorator extends Book {
    protected Book book;

    public BookDecorator(Book book) {
        super(book.getTitle());
        this.book = book;
    }

        @Override
    public void borrowBook(User user) {
        book.borrowBook(user);
    }

        @Override
    public void returnBook() {
        book.returnBook();
    }

        @Override
    public boolean isAvailable() {
        return book.isAvailable();
    }

        @Override
    public String getTitle() {
        return book.getTitle();
    }

}

public class PremiumBookDecorator extends BookDecorator {
    private final int extraDays = 10;
    private final int normalBorrowDays = 14;

    public PremiumBookDecorator(Book book)
    {
        super(book);
    }

    public int getBorrowDays() {
    return normalBorrowDays + extraDays;
    }

    @Override
    public void borrowBook(User user) {
    book.borrowBook(user);
    System.out.println("Premium borrow period for \"" + book.getTitle() + "\" = " + getBorrowDays() + " days.");
    }
}

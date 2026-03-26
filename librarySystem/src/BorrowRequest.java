public class BorrowRequest {
    private User user;
    private Book book;
    private int days;

    public BorrowRequest(User user, Book book, int days) {
        this.user = user;
        this.book = book;
        this.days = days;
    }

    public User getUser() {
        return user;
    }

    public Book getBook() {
        return book;
    }

    public int getDays() {
        return days;
    }
}
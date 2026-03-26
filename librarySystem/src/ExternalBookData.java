public class ExternalBookData {
    private String bookTitle;
    private boolean borrowable;
    private String authorName;
    private int year;

    public ExternalBookData(String bookTitle, boolean borrowable, String authorName, int year) {
    this.bookTitle = bookTitle;
    this.borrowable = borrowable;
    this.authorName = authorName;
    this.year = year;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public boolean isBorrowable() {
        return borrowable;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getYear() {
        return year;
    }
}

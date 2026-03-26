public class PremiumEBookProxy extends Book {
    private EBook ebook;

    public PremiumEBookProxy(EBook ebook) {
        super(ebook.getTitle());
        this.ebook = ebook;
    }

    @Override
    public void borrowBook(User user) {
        if (user.isPremium()) {
            ebook.borrowBook(user);
            System.out.println("Premium access granted to EBook: " + ebook.getTitle());
        } else {
            System.out.println("Access denied. " + user.getName() + " is not a premium user.");
        }
    }

    @Override
    public void returnBook() {
        ebook.returnBook();
    }

    @Override
    public boolean isAvailable() {
        return ebook.isAvailable();
    }

    @Override
    public String getTitle() {
        return ebook.getTitle();
    }
}
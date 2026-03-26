import java.util.ArrayList;
import java.util.List;

public class NotifiableBook extends Book implements Subject {
    private List<Observer> observers = new ArrayList<>();

    public NotifiableBook(String title) {
        super(title);
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update("Book \"" + getTitle() + "\" is now available.");
        }
    }

    @Override
    public void returnBook() {
        super.returnBook();
        notifyObservers();
    }
}
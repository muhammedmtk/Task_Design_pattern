public class Manager extends Approver {

    @Override
    public void handleRequest(BorrowRequest request) {
        System.out.println("Manager approved borrowing request for: " + request.getBook().getTitle());
        request.getBook().borrowBook(request.getUser());
    }
}
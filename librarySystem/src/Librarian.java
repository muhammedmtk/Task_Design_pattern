public class Librarian extends Approver {

    @Override
    public void handleRequest(BorrowRequest request) {
        System.out.println("Librarian received request for book: " + request.getBook().getTitle());

        if (nextApprover != null) {
            nextApprover.handleRequest(request);
        } else {
            System.out.println("No one else available to handle the request.");
        }
    }
}
public class Account {

    int no_borrowed_books, no_reserved_books, no_returned_books, no_lost_books ,fine_amount;

    private LibraryDatabase libraryDatabase;  // Many-to-one association

    public int Calculate_fine(){
        return 0;
    }
}

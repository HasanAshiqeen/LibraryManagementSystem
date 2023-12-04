import java.util.List;

public class Book {

    String Title, Author, ISBN, Publication;

    private LibraryManagmentSystem libraryManagmentSystem; // Many-to-one composition
    private LibraryDatabase libraryDatabase;  // Many-to-one association
    private List<User> borrowers;  // Many-to-many association


    public void Show_duedt(){

    }
    public void Reservation_status(){}
    public void Feedback(){};
    public void Book_request(){};
    public void Renew_info(){};


}

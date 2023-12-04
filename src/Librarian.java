import java.util.List;

public class Librarian {

    int id;
    String Name , Password, SearchString;

    private LibraryManagmentSystem libraryManagmentSystem; // Many-to-one composition
    private LibraryDatabase libraryDatabase; //One-to-one association
    private List<Book> bookInCharge;// association


    public void Verify_librarian(){}
    public void Search(){}


}

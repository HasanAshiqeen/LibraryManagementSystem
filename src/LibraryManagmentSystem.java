import java.util.ArrayList;
import java.util.List;

public class LibraryManagmentSystem {

    String UserType;
    String UserName;
    String Password;


    private List<User> users;  // Many-to-one composition
    private List<Book> books; // Many-to-one composition
    private List<Librarian> librarians ;  // Many-to-one composition

    public LibraryManagmentSystem() {
        this.users = new ArrayList<>();
        this.books = new ArrayList<>();
        this.librarians = new ArrayList<>();
    }

    public void Login(){

    }
    public void Register(){

    }
    public void logOut(){

    }
}

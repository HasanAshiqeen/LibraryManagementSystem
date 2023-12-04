import java.util.List;

public class User {

    private String Name;
    private int id;
    private Account account; // Composition relationship

    private LibraryManagmentSystem libraryManagmentSystem; // Many-to-one composition


    private List<Book> borrowedBooks;  // Many-to-many association

    public  User(){

    }

    public User(String name,int id,double balance){
        this.Name = name;
        this.id = id;
        this.account = new Account(); //composition

    }

    public void verify(){

    }
    public void CheckAccount(){

    }

    public String get_book_info(){

        return "";

    }
}

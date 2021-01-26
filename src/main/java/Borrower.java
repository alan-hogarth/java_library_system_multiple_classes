import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> collection;
    private Library library;

    public Borrower(){
        this.collection = new ArrayList<Book>();
    }


    public int getBooks() {
        return collection.size();
    }

    public void addBookToCollection(Book book) {
        collection.add(book);
    }

    public void borrowBook(Library library) {
        Book borrowedBook = library.lendBook();
        addBookToCollection(borrowedBook);
    }
}

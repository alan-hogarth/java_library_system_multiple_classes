import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> bookCollection;
    private int capacity = 5;
    private HashMap<String, Integer> bookGenre;

    public Library(){
        this.bookCollection = new ArrayList<Book>();
        this.capacity = 5;
        this.bookGenre = new HashMap<String, Integer>();
        bookGenre.put("Historical Fiction", 15);
        bookGenre.put("Fantasy", 25);
        bookGenre.put("Science Fiction", 30);
    }

    public int getBookStock() {
        return bookCollection.size();
    }

    public void addBookToStock(Book book1) {
        if (getBookStock() < capacity)
        bookCollection.add(book1);
    }

    public Book lendBook(){
        return bookCollection.remove(0);
    }

}

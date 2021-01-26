import java.util.ArrayList;

public class Library {

    private ArrayList<Book> bookCollection;
    private int capacity = 5;

    public Library(){
        this.bookCollection = new ArrayList<Book>();
        this.capacity = 5;

    }


    public int getBookStock() {
        return bookCollection.size();
    }

    public void addBookToStock(Book book1) {
        if (getBookStock() < capacity)
        bookCollection.add(book1);
    }


}

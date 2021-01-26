import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower steve;
    private Book book;
    private Library library;

    @Before
    public void before(){
        steve = new Borrower();
        book = new Book("Kapital", "KM", "NonFiction");
        library = new Library();
        library.addBookToStock(book);
    }

    @Test
    public void hasNoBooks(){
        assertEquals(0, steve.getBooks());
    }

    @Test
    public void canAddBookToCollection(){
        steve.addBookToCollection(book);
        assertEquals(1, steve.getBooks());
    }

    @Test
    public void canBorrowFromTheLibrary(){
        steve.borrowBook(library);
        assertEquals(1, steve.getBooks());
        assertEquals(0, library.getBookStock());
    }
}

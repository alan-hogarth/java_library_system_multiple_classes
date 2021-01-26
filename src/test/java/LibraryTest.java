import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;
    private Book book5;
    private Book book6;

    @Before
    public void before(){
        library = new Library();
        book1 = new Book("Wolf Hall", "Hilary Mantel", "Historical Fiction");
        book2 = new Book("Persuasion", "Jane Austen", "Fiction");
        book3 = new Book("Kapital", "Karl Marx", "NonFiction");
        book4 = new Book("Origin of Species", "Charles Darwin", "NonFiction");
        book5 = new Book("Diary of Samuel Pepys", "Samuel Pepys", "Autobiography");
        book6 = new Book("Leviathan", "Thomas Hobbes", "Political Philosophy");
    }

    @Test
    public void canCountBookStock(){
        assertEquals(0, library.getBookStock());
    }

    @Test
    public void canAddBookToStock(){
        library.addBookToStock(book1);
        library.addBookToStock(book2);
        library.addBookToStock(book3);
        assertEquals(3, library.getBookStock());
    }

    @Test
    public void cantAddBookToStock(){
        library.addBookToStock(book1);
        library.addBookToStock(book2);
        library.addBookToStock(book3);
        library.addBookToStock(book4);
        library.addBookToStock(book5);
        library.addBookToStock(book6);
        assertEquals(5, library.getBookStock());

    }
}

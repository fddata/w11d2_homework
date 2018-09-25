import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    
    Book book1;
    Book book2;
    Book book3;

    @Before
    public void testSetup(){
        book1 = new Book("Title1", "Author1", "Genre1");
        book2 = new Book("Title2", "Author2", "Genre2");
        book3 = new Book("Title3", "Author3", "Genre3");
    }

    @Test
    public void bookHasTitle() {
        assertEquals("Title1", book1.getTitle());
    }

    @Test
    public void bookHasAuthor() {
        assertEquals("Author1", book1.getAuthor());
    }


    @Test
    public void bookHasGenre() {
        assertEquals("Genre1", book1.getGenre());
    }
}

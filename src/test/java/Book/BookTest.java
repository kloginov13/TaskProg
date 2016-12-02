package Book;
import org.junit.Test;


import static org.junit.Assert.*;

/**
 * Created by Админ on 15.11.2016.
 */
public class BookTest {

    @Test
    public void testPublisher() {
        Book book1 = new Book("Война и мир", "Л.Н. Толстой", 1863, "ХудКнига");
        assertEquals("ХудКнига", book1.publisher.name);
    }

    @Test
    public void testisNewBook() {
        Book book1 = new Book("Война и мир", "Л.Н. Толстой", 2005, "ХудКнига");
        assertEquals("Old book", book1.relativeBookAge(2005));

    }

    public void testRelateveBookAge() {
        Book book1 = new Book("Война и мир", "Л. Н. Толстой", 2005, "ХудКнига") {
            @Override
            public String relativeBookAge(int
                                    year) {
                if ((2016 - year) < 1) {
                    return "New book";
                } else {
                    return "Old book";
                }
            }

        };

    }
}
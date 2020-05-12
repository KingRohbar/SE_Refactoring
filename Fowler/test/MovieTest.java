import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class MovieTest {

    Movie test = new Movie("Jurassic Test", 1);

    @Test
    void getPriceCode() {
        assertEquals(test.getPriceCode(), 1);
    }

    @Test
    void setPriceCode() {
        test.setPriceCode(2);
        assertEquals(test.getPriceCode(), 2);
    }

    @Test
    void getTitle() {
        assertEquals(test.getTitle(), "Jurassic Test");
    }
}
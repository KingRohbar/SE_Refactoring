import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RentalTest {

    Movie testMovie = new Movie("Jurassic Test", 1);
    Rental test = new Rental(testMovie, 2);

    @Test
    void getDaysRented() {
        assertEquals(test.getDaysRented(), 2);
    }

    @Test
    void getMovie() {
        assertEquals(test.getMovie(), testMovie);
    }
}
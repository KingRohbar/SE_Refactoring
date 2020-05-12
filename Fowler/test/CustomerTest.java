import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    Movie testMovie = new Movie("Jurassic Test", 1);
    Rental testRental = new Rental(testMovie, 2);
    Customer test = new Customer("Testmann");

    @Test
    void addRental() {
        test.addRental(testRental);
        assertEquals(test.getRentals().size(), 1);
    }

    @Test
    void getName() {
        assertEquals(test.getName(), "Testmann");
    }

    @Test
    void statement() {
        test.addRental(testRental);
        assertEquals(test.statement(), "Rental Record for Testmann\n" + "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n" +
                "\t" + "Jurassic Test"+ "\t" + "\t" + 2 + "\t" + 6.0 + "\n" + "Amount owed is " + 6.0 + "\n" +
                "You earned " + 2 + " frequent renter points");
    }
}
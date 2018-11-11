package guru.springframework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {

    private Dollar fiveDollars;
    private Franc fiveFrancs;

    @BeforeEach
    void setUp() {
        fiveDollars = new Dollar(5);
        fiveFrancs = new Franc(5);
    }

    @Test
    void testMultiplicationDollar() {
        assertEquals(new Dollar(10), fiveDollars.times(2));
        assertEquals(new Dollar(15), fiveDollars.times(3));
    }

    @Test
    void testEqualityDollar() {
        assertEquals(new Dollar(5), new Dollar(5));
        assertNotEquals(new Dollar(5), new Dollar(8));
    }

    @Test
    void testMultiplicationFranc() {
        assertEquals(new Franc(10), fiveFrancs.times(2));
        assertEquals(new Franc(15), fiveFrancs.times(3));
    }

    @Test
    void testEqualityFranc() {
        assertEquals(new Franc(5), new Franc(5));
        assertNotEquals(new Franc(5), new Franc(8));
    }
}

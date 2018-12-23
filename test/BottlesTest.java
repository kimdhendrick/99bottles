import org.junit.Test;

import static org.junit.Assert.*;

public class BottlesTest {
    @Test
    public void testTheFirstVerse() {
        String expected = "99 bottles of beer on the wall, " +
                "99 bottles of beer.\n" +
                "Take one down and pass it around, " +
                "98 bottles of beer on the wall.\n";

        assertEquals(expected, new Bottles().verse(99));
    }
}
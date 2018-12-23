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

    @Test
    public void testAnotherVerse() {
        String expected = "3 bottles of beer on the wall, " +
                "3 bottles of beer.\n" +
                "Take one down and pass it around, " +
                "2 bottles of beer on the wall.\n";

        assertEquals(expected, new Bottles().verse(3));
    }

    @Test
    public void testVerse2() {
        String expected = "2 bottles of beer on the wall, " +
                "2 bottles of beer.\n" +
                "Take one down and pass it around, " +
                "1 bottle of beer on the wall.\n";

        assertEquals(expected, new Bottles().verse(2));
    }

    @Test
    public void testVerse1() {
        String expected = "1 bottle of beer on the wall, " +
                "1 bottle of beer.\n" +
                "Take it down and pass it around, " +
                "no more bottles of beer on the wall.\n";

        assertEquals(expected, new Bottles().verse(1));
    }

    @Test
    public void testVerse0() {
        String expected = "No more bottles of beer on the wall, " +
                "no more bottles of beer.\n" +
                "Go to the store and buy some more, " +
                "99 bottles of beer on the wall.\n";

        assertEquals(expected, new Bottles().verse(0));
    }
}
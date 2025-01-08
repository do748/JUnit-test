import static org.junit.jupiter.api.Assertions.*;

import org.example.StringManipulator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringManipulatorTest {
    private StringManipulator stringManipulator;

    @BeforeEach
    public void setUp() {
        stringManipulator = new StringManipulator();
    }

    @Test
    public void testIsPalindrome_True() {
        assertTrue(stringManipulator.isPalindrome("A man a plan a canal Panama"));
    }

    @Test
    public void testIsPalindrome_False() {
        assertFalse(stringManipulator.isPalindrome("Hello, World!"));
    }

    @Test
    public void testIsPalindrome_Null() {
        assertFalse(stringManipulator.isPalindrome(null));
    }

    @Test
    public void testReverse() {
        assertEquals("olleH", stringManipulator.reverse("Hello"));
    }

    @Test
    public void testReverse_Null() {
        assertNull(stringManipulator.reverse(null));
    }
}

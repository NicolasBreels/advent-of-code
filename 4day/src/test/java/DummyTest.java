import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DummyTest {
    @Test
    public void Test1() {
        Dummy dummy = new Dummy();
        assertFalse(dummy.isFullyContain(2, 4, 6, 8));
        assertFalse(dummy.isFullyContain(2, 3, 4, 5));
        assertFalse(dummy.isFullyContain(5, 7, 7, 9));
        assertTrue(dummy.isFullyContain(2, 8, 3, 7));
        assertTrue(dummy.isFullyContain(6, 6, 4, 6));
        assertFalse(dummy.isFullyContain(2, 6, 4, 8));
    }

    @Test
    public void Test2() {
        Dummy dummy = new Dummy();
        assertFalse(dummy.isOverLap(2, 4, 6, 8));
        assertFalse(dummy.isOverLap(2, 3, 4, 5));
        assertTrue(dummy.isOverLap(5, 7, 7, 9));
        assertTrue(dummy.isOverLap(2, 8, 3, 7));
        assertTrue(dummy.isOverLap(6, 6, 4, 6));
        assertTrue(dummy.isOverLap(2, 6, 4, 8));
    }

    @Test
    public void browseContentTest() {
        Dummy dummy = new Dummy();
        String newString = "2-4,6-8\n" + "2-3,4-5\n" + "5-7,7-9\n" + "2-8,3-7\n" + "6-6,4-6\n" + "2-6,4-8";
        assertEquals(2, dummy.browseContent(newString));
    }

    @Test
    public void browseContent2Test() {
        Dummy dummy = new Dummy();
        String newString = "2-4,6-8\n" + "2-3,4-5\n" + "5-7,7-9\n" + "2-8,3-7\n" + "6-6,4-6\n" + "2-6,4-8";
        assertEquals(4, dummy.browseContent2(newString));
    }
}

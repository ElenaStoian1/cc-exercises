import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;

class GapTest {
    private Gap gap = new Gap();

    @Test
    void testThatLargestGapIsReturned() {

        int[] array = new int[] { 9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5 };

        assertEquals(11, gap.largestGap(array) );
    }

    @Test
    void testThatLargestGapIsNotReturned() {

        int[] array = new int[] { 9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5 };

        assertFalse(10 == gap.largestGap(array) );
    }

    @Test
    void testThatLargestGapReturnNullPointerException() {

        assertThrows(NullPointerException.class, () -> {
            gap.largestGap(null);
        });
    }
}
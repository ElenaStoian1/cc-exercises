import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

class CalculateLargestGapTest {

    private CalculateLargestGap calculateLargestGap;

    @BeforeEach
    void init() {
        calculateLargestGap = new CalculateLargestGap();
    }

    @Test
    @DisplayName("Return expected Gap")
    void testThatLargestGapIsReturned() {
        int[] array = new int[]{14, 13, 7, 1, 4, 12, 3, 7, 7, 12, 11, 5, 7};

        Gap expected = new Gap(4, 7, 11);
        Gap actual = calculateLargestGap.largestGap(array);

        assertTrue(actual.equals(expected));
    }

    @Test
    @DisplayName("Return unexpected Gap")
    void testThatLargestGapIsNotReturned() {
        int[] array = new int[]{14, 13, 725, 17, 12, 11, 5, 7};

        Gap expected = new Gap(0, 0, 0);
        Gap actual = calculateLargestGap.largestGap(array);

        assertFalse(actual.equals(expected));
    }

    @Test
    @DisplayName("One element array")
    void testThatLargestGapReceivesOneElement() {
        int[] array = new int[]{9};

        Gap expected = new Gap(0, 0, 0);
        Gap actual = calculateLargestGap.largestGap(array);

        assertTrue(actual.equals(expected));
    }

    @Test
    @DisplayName("Empty array")
    void testThatLargestGapReceivesEmptyArray() {
        int[] array = new int[]{};

        Gap expected = new Gap(0, 0, 0);
        Gap actual = calculateLargestGap.largestGap(array);

        assertTrue(actual.equals(expected));
    }

    @Test
    @DisplayName("Null array")
    void testThatLargestGapReceivesNull() {
        Gap expected = new Gap(-1, -1, -1);
        Gap actual = calculateLargestGap.largestGap(null);

        assertTrue(actual.equals(expected));

    }
}
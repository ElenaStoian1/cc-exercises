import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CalculateArrayOfMultiplesTest {
    private CalculateArrayOfMultiples calculateArrayOfMultiples;

    @BeforeEach
    void init() {
        calculateArrayOfMultiples = new CalculateArrayOfMultiples();
    }

    @Test
    @DisplayName("Return expected array")
    void testArraysOfMultiplesReturnTheCorrectArray() {
        int[] expectedArray = new int[]{7, 14, 21, 28, 35};

        assertArrayEquals(expectedArray, calculateArrayOfMultiples.arraysOfMultiples(7, 5));
    }

    @Test
    @DisplayName("Return unexpected array")
    void testArraysOfMultiplesDoNotReturnTheCorrectArray() {
        int[] unexpectedArray = new int[]{7, 14, 21, 28, 35};

        assertFalse(Arrays.equals(unexpectedArray, calculateArrayOfMultiples.arraysOfMultiples(7, 10)));
    }

    @Test
    @DisplayName("length < 0")
    void testArraysOfMultiplesReceivesNegativeLength() {
        assertTrue(Arrays.equals(new int[]{-1}, calculateArrayOfMultiples.arraysOfMultiples(5, -5)));
    }

    @Test
    @DisplayName("length = 0")
    void testArraysOfMultiplesReceivesLengthZero() {
        assertTrue(Arrays.equals(new int[]{}, calculateArrayOfMultiples.arraysOfMultiples(5, 0)));
    }

    @Test
    @DisplayName("num = 0")
    void testArraysOfMultiplesReceivesNumZero() {
        int[] expectedArray = new int[]{0, 0, 0, 0, 0};

        assertTrue(Arrays.equals(expectedArray, calculateArrayOfMultiples.arraysOfMultiples(0, 5)));
    }

    @Test
    @DisplayName("num = 0, length = 0")
    void testArraysOfMultiplesReceivesNumZeroLengthZero() {
        assertTrue(Arrays.equals(new int[]{}, calculateArrayOfMultiples.arraysOfMultiples(0, 0)));
    }

}
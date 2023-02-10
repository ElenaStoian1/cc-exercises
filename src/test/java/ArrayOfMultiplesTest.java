import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArrayOfMultiplesTest {

    private ArrayOfMultiples arrayOfMultiples = new ArrayOfMultiples();

    @Test
    void testArraysOfMultiplesReturnTheCorrectArray() {

        int[] expectedArray = new int[] {7, 14, 21, 28, 35};

        assertArrayEquals(expectedArray, arrayOfMultiples.arraysOfMultiples(7, 5));
    }

    @Test
    void testArraysOfMultiplesDoNotReturnTheCorrectArray() {

        int[] unexpectedArray = new int[] {7, 14, 21, 28, 35};

        assertFalse(Arrays.equals(unexpectedArray, arrayOfMultiples.arraysOfMultiples(7, 10)));
    }
}
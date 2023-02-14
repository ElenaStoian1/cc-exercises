import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

/**
 * Class' scope is to calculate the multiples of a number
 */
public class CalculateArrayOfMultiples {

    private static final Logger logger = LoggerFactory.getLogger(CalculateArrayOfMultiples.class);

    /**
     * The method takes a number and length as parameters, and returns an array of multiples of that number,
     * until the array's length reaches the length parameter.
     *
     * @param num    the number from which to calculate the multiples
     * @param length the maximum length of the returned array of multiples
     * @return the array of multiples
     */

    public int[] arraysOfMultiples(int num, int length) {

        if (length < 0) {
            logger.warn("Negative length passed.");
            return new int[]{-1};
        }

        int[] multiples = new int[length];

        for (int i = 0; i < length; i++) {
            multiples[i] = num * (i + 1);
        }

        logger.info("Array of multiples for number {} of length {}: {}", num, length, Arrays.toString(multiples));
        return multiples;
    }
}

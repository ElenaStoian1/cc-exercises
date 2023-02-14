import org.slf4j.LoggerFactory;

import java.util.Arrays;

import org.slf4j.Logger;

/**
 * Class' scope is to calculate the largest gap between two numbers from an array
 */
public class CalculateLargestGap {

    private static final Logger logger = LoggerFactory.getLogger(CalculateLargestGap.class);

    private Gap gap = new Gap();

    /**
     * The method is sorting the received array, and after that it is calculating the largest gap
     * between two numbers from that array
     *
     * @param array is the array from which the gap is calculated
     * @return Gap object, which contain the gap size, and the numbers between which the gap is found
     */
    public Gap largestGap(int[] array) {

        if (null == array) {
            logger.warn("A null array was passed as an argument");

            return new Gap(-1, -1, -1);
        }

        Arrays.sort(array);

        for (int i = 0; i < array.length - 1; i++) {

            if (array[i + 1] - array[i] > gap.getGapSize()) {
                gap.setGapSize(array[i + 1] - array[i]);
                ;
                gap.setGapFrom(array[i]);
                gap.setGapTo(array[i + 1]);
            }
        }

        logger.info("The sorted array is {} ", Arrays.toString(array));
        logger.info("Largest gap is {} spaces, between {} and {}", gap.getGapSize(), gap.getGapFrom(), gap.getGapTo());

        return gap;
    }
}

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Gap {

    private static final Logger LOGGER = Logger.getLogger(Gap.class.getName());

    /**
     * This method returns the largest gap between 2 numbers from an array of integers.
     * @param array - the array from which the gap will be calculated
     * @return the value of the largest gap
     */
    public int largestGap(int[] array) {

         int gap = 0;
         int[] gapBetweenNumbers = new int[2];

        try {
            Arrays.sort(array);

            for (int i = 0; i < array.length - 1; i++) {
                if (array[i + 1] - array[i] > gap) {
                    gap = array[i + 1] - array[i];
                    gapBetweenNumbers[0] = array[i];
                    gapBetweenNumbers[1] = array[i + 1];
                }
            }

            LOGGER.info("The sorted array is: " + Arrays.toString(array));
            LOGGER.info("Largest gap is " + gap + " spaces, between " + Arrays.toString(gapBetweenNumbers) + "\n\n");

        } catch (NullPointerException nullPointerException) {
            LOGGER.log(Level.SEVERE, "A Null Pointer Exception has been thrown", nullPointerException);
        } catch (ArrayStoreException arrayStoreException) {
            LOGGER.log(Level.SEVERE, "An Array Store Exception has been thrown", arrayStoreException);
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "An exception has been thrown", e);
        }

        return gap;
    }
}

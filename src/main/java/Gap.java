import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Gap {

    private static final Logger logger = Logger.getLogger(Gap.class.getName());

    public int largestGap(int[] array) {

        Arrays.sort(array);

        int gap = 0;
        int[] gapNumbers = new int[2];

        try {
            for (int i = 0; i < array.length - 1 ; i++) {
                if (array[i + 1] - array[i] > gap) {
                    gap = array[i + 1] - array[i];
                    gapNumbers[0] = array[i];
                    gapNumbers[1] = array[i + 1];
                }
            }

            logger.info("The sorted array is: " + Arrays.toString(array));
            logger.info("Largest gap is " + gap + " spaces, between " + Arrays.toString(gapNumbers) + "\n\n" );


        }
        catch (NullPointerException nullPointerException) {
            logger.log(Level.SEVERE, "A Null Pointer Exception has been thrown", nullPointerException);
        }
        catch (ArrayStoreException   arrayStoreException) {
            logger.log(Level.SEVERE, "An Array Store Exception has been thrown", arrayStoreException);
        }

        return gap;
    }
}

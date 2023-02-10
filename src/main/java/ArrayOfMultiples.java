import java.util.Arrays;

public class ArrayOfMultiples {

    /**
     * A function that takes two numbers as arguments and returns an array of multiples of a number,
     * until the array length reaches length parameter.
     * @param num - the number from which to calculate the multiples
     * @param length the maximum length of the returned array of multiples
     * @return the array of multiples
     */

    public int[] arraysOfMultiples(int num, int length) {

        int[] multiples = new int[length];

        try {

            for (int i = 0; i < length; i++) {
                multiples[i] = num * (i + 1);
            }

        } catch(Exception e) {
            System.out.println(e);
        }

        System.out.println("Array of multiples for number " + num + " of length " + length + ": " + Arrays.toString(multiples));

        return multiples;
    }
}

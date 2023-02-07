import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[] { 9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5 };
        int[] array2 = new int[] { 14, 13, 7, 1, 4, 12, 3, 7, 7, 12, 11, 5, 7 };
        int[] array3 = new int[] { 13, 3, 8, 5, 5, 2, 13, 6, 14, 2, 11, 4, 10, 8, 1, 9 };

        largestGap(array);
        largestGap(array2);
        largestGap(array3);
    }

    public static void largestGap(int[] array) {

        Arrays.sort(array);

        int gap = 0;
        for(int i = 0; i < array.length -1; i++) {
            if(array[i+1] - array[i] > gap) {
                gap = array[i+1] - array[i];
            }
        }

        System.out.println("\nSorted array: " + Arrays.toString(array));
        System.out.println("Largest gap: " + gap);
    }
}
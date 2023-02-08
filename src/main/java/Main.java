public class Main {

    public static void main(String[] args) {

        Gap gap = new Gap();

        int[] array = new int[] { 9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5 };
        int[] array2 = new int[] { 14, 13, 7, 1, 4, 12, 3, 7, 7, 12, 11, 5, 7 };
        int[] array3 = new int[] { 13, 3, 8, 5, 5, 2, 13, 6, 14, 2, 11, 4, 10, 8, 1, 9 };

        gap.largestGap(array);
        gap.largestGap(array2);
        gap.largestGap(array3);
    }


}
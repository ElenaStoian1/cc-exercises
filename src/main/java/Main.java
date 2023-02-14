public class Main {

    public static void main(String[] args) {
        Main main = new Main();

        main.callLargestGap();
        main.callArrayOfMultiples();
    }

    private void callLargestGap() {
        CalculateLargestGap calculateLargestGap = new CalculateLargestGap();

        int[] array = new int[] { 14, 13, 7, 1, 4, 12, 3, 7, 7, 12, 11, 5, 7 };
        calculateLargestGap.largestGap(array);
        calculateLargestGap.largestGap(null);
    }

    private void callArrayOfMultiples() {
        CalculateArrayOfMultiples calculateArrayOfMultiples = new CalculateArrayOfMultiples();

        calculateArrayOfMultiples.arraysOfMultiples(7, 5);
        calculateArrayOfMultiples.arraysOfMultiples(7, -5);
    }
}
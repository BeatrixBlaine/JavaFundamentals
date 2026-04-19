import java.util.Arrays;

public class BinarySearch {

    public static int binarySearch(int[] numbers, int numberToFind) {

        // Initialize 2 pointers
        int low = 0;
        int high = numbers.length - 1;

        // Loop
        while (low <= high) {
            int middlePosition = (low + high) / 2;
            int middleNumber = numbers[middlePosition];

            if (numberToFind == middleNumber) {
                return middlePosition;
            }
            if (numberToFind < middleNumber) {
                high = middlePosition - 1;
            } else {
                low = middlePosition + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,8,17,9,6,11,13,3,4,5,10,7};

        Arrays.sort(numbers);
        // my algorithm
        System.out.println(binarySearch(numbers, 6));
        // library
        System.out.println(Arrays.binarySearch(numbers, 6));
    }
}

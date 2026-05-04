package Algorithm;

import java.util.Random;

public class BubbleSort {

    public static void main(String[] args) {

        Random rand = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(50);
        }

        System.out.println("Before : ");
        PrintArray.printArray(numbers);

        System.out.println("After : ");
        bubbleSort(numbers);
        PrintArray.printArray(numbers);

    }

    public static void bubbleSort(int[] array) {
        boolean swapped = true;

        while (swapped) {
            swapped = false;
            for (int i = 0; i < array.length - 1; i++) {
                // swap value if the left index value is bigger than the right index value
                if (array[i] > array[i + 1]) {
                    // if condition is met, turn swapped into true. So the while loop run again.
                    // if there's no more value left to be swapped, the loop stops
                    swapped = true;
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }

    }

}

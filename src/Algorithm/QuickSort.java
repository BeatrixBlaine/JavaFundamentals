package Algorithm;

import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {

        Random rand = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(50);
        }

        System.out.println("Before : ");
        PrintArray.printArray(numbers);

        System.out.println("After : ");
        quickSort(numbers);
        PrintArray.printArray(numbers);


    }

    public static void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    public static void quickSort(int[] arrayValue, int lowIndex, int highIndex) {

        if (lowIndex >= highIndex) {
            return;
        }

        int pivot = arrayValue[highIndex];
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer) {

            while (arrayValue[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }

            while (arrayValue[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }

            swap(arrayValue, leftPointer, rightPointer);

        }

        swap(arrayValue, leftPointer, highIndex);
        quickSort(arrayValue, lowIndex, leftPointer - 1);
        quickSort(arrayValue, leftPointer + 1, highIndex);

    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}

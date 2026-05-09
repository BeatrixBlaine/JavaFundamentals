package Application;

import Algorithm.PrintArray;

import java.util.Random;

public class RandomApp {
    public static void main(String[] args) {
        
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            var value = random.nextInt(10);
            System.out.println(value);
        }

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }

        PrintArray.printArray(array);

    }
}

package Algorithm;

import java.lang.reflect.Array;

public class Fibonacci {

    public static void main(String[] args) {


        PrintArray.printArray(fibonacci(10));

    }

    public static int[] fibonacci(int iteration) {
        int[] array = new int[iteration];
        int value1 = 0;
        int value2 = 1;

        for (int i = 0; i < iteration; i++) {
            array[i] = value1;
            int temp = value1 + value2;
            value1 = value2;
            value2 = temp;
        }

        return array;
    }

}

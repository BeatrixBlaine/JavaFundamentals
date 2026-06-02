package Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class printSum {
    public static void main(String[] args) {

//        Create a method named printSum that takes a 2D array of integers as an argument. The method should:
//        Calculate and print the sum of each row
//        Print the sums in the format: "Row X sum: Y" (where X is the row index and Y is the sum)
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        printSum(array);

        System.out.println(Arrays.toString(processMatrix(array)));

    }

    public static void printSum(int[][] array) {
        // Write your code here
        for (int i = 0; i < array.length; i++) {
            int sum = 0; // initialize the variable for storing the sum of each row,
                        // so when the loops start when i = 1, the sum will reset to 0
            for(int j = 0; j < array[i].length; j++) {
                sum += array[i][j]; // calculate
            }
            System.out.println("Row " + i + " sum: " + sum);
        }
    }

    public static int[] processMatrix(int[][] matrix) {
        // Write your code here
        int sum = 0; // sum all of value inside matrix
        int max = matrix[0][0]; // get the biggest value in the matrix
        int countEven = 0; // count even numbers inside the matrix

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
                if (matrix[i][j] % 2 == 0 || matrix[i][j] == 0) {
                    countEven++;
                }
            }
        }

        int[] result = {sum, max, countEven};

        return result;
    }
}

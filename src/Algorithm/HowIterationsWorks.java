package Algorithm;

import java.util.Scanner;

public class HowIterationsWorks {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number of iterations: ");
        int value = scanner.nextInt();

        // example (first loop is row, second loop is column)
        for (var i = 1; i <= value; i++) {
            for (var j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // create a square
        int size = 7;

        for (var i = 1; i <= size; i++) {
            for (var j = 1; j <= size; j++) {
                if (i == 1 || i == size || j == 1 || j == size) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();
        // triangle
        int triangleSize = 5;

        for (int i = 1; i <= triangleSize; i++) {

            // print spaces
            for (int j = 1; j <= triangleSize - i; j++) {
                System.out.print("  ");
            }

            // print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }

}

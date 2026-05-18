package Algorithm;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input height: ");
        int height = scanner.nextInt();
        System.out.print("Input width: ");
        int width = scanner.nextInt();
        System.out.println();

        // 5x5
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                int value = j * i;

                if ((value >= 10 || value <= 10) && j == 5) {
                    System.out.print(value);
                } else if (value >= 10 && j != 5) {
                    System.out.print(value + " ");
                } else {
                    System.out.print(value + "  ");
                }
            }
            System.out.println();
        }

    }
}

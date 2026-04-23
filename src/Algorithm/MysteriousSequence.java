package Algorithm;

import java.util.Scanner;

public class MysteriousSequence {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        int x = scanner.nextInt();

        for (int i = 1; i <= x; i++) {
            int number;
            if (i % 2 == 0) {
                number = i * i * i;
                System.out.print(number + " ");
            } else {
                number = i * i;
                System.out.print(number + " ");
            }
        }

    }



}

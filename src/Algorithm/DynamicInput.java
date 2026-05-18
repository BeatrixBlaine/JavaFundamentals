package Algorithm;

import java.util.Scanner;

public class DynamicInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfInput = scanner.nextInt();
        int[] sumArray = new int[numberOfInput];

        for (int i = 0; i < numberOfInput; i++) {
            sumArray[i] = scanner.nextInt();
        }

        int result = 0;
        for (int num : sumArray) {
            result += num;
        }

        // sum
        System.out.println(result);

    }
}

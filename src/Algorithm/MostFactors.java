package Algorithm;

import java.util.Scanner;


public class MostFactors {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 2 input
        System.out.print("Input first number : ");
        int x = scanner.nextInt();
        System.out.print("Input second number : ");
        int y = scanner.nextInt();

        int maxFactors = 0;
        int result = x;

        for (int i = x; i <= y; i++) {
            int factors = countFactor(i);

            if (factors > maxFactors) {
                maxFactors = factors;
                result = i;
            }
        }

        System.out.println(result);

    }

    public static int countFactor(int value) {
        int count = 0;

        for (int i = 1; i <= Math.sqrt(value); i++) {
            if (value % i == 0) {
                if (i == value / i) {
                    count += 1;
                } else {
                    count += 2;
                }
            }
        }

        return count;

    }
}

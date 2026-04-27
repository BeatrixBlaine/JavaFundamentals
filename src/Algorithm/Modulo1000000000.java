package Algorithm;

import finalClass.SocialMedia;

import java.util.Scanner;

public class Modulo1000000000 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number1 : ");
        int x = scanner.nextInt();
        System.out.println("Input number2 : ");
        int y = scanner.nextInt();

        System.out.println(pangkat(x, y));

    }

    public static int pangkat(int N, int M) {
        long result = 1;
        long base = N;
        int mod = 1_000_000_000;

        while (M > 0) {
            if (M % 2 == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            M /= 2;
        }

        return (int) result;
    }
}

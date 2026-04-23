import java.util.Scanner;

public class CheckPrimeNumber {

    public static boolean isPrime(int x) {
        if (x <= 1) {
            return false;
        }

        // stop the loop before reaching x
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number: ");
        int n = scanner.nextInt();

        if (isPrime(n)) {
            System.out.println(n + " is a prime number!");
        } else {
            System.out.println(n + " is not a prime number!");
        }

    }

}

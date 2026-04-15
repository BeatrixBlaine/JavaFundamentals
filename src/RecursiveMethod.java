
public class RecursiveMethod {

    static int factorial(int value) {
        int result = 1;

        if (value > 1) {
            for (int i = 1; i <= value; i++) {
                result *= i; // result = result * i
            }
            return result;
        } else if (value == 1 || value == 0) {
            result = 1;
            return result;
        } else {
            throw new IllegalArgumentException("Negative numbers not allowed");
        }

    }

    static int recursive(int value) {

        if (value < 0) {
            throw new IllegalArgumentException("Negative numbers not allowed!");
        }

        if (value == 0 || value == 1) {
            return 1;
        }

        return value * recursive(value -1);

    }

    public static void main(String[] args) {

        int result = factorial(0);
        System.out.println(result);

        int result2 = recursive(4);
        System.out.println(result2);

    }

}

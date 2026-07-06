package StaticKeyword;

public class MathUtil {

    public static int add(int value1, int value2) {
        return value1 + value2;
    }

    public static int subtract(int value1, int value2) {
        return value1 - value2;
    }

    public static int multiply(int value1, int value2) {
        return value1 * value2;
    }

    public static int square(int value1, int value2) {
        return Math.powExact(value1, value2);
    }

}

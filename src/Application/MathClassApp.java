package Application;

public class MathClassApp {
    public static void main(String[] args) {

        int a = 6;
        int b = 3;

        // base number = a, power/exponent = b
        double result = Math.pow(a,b);
        System.out.println(result);

        // square of 130
        System.out.println(Math.sqrt(130));

        // round the value
        System.out.println(Math.round(Math.sqrt(130)));

        // absolute number (always turn it into positive number)
        System.out.println(Math.abs(-1235));

        // find the biggest number of 2 int input
        System.out.println(Math.max(124124,124212));


    }
}

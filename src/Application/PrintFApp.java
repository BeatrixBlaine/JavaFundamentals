package Application;

import java.time.temporal.IsoFields;

public class PrintFApp {
    public static void main(String[] args) {

        int value1 = 25;
        double value2 = 2.1290192031;
        String value3 = "Irsyad";
        char value4 = 'c';
        boolean value5 = true;

        // use %n to create another print another line
        System.out.printf("Current number %d%n", value1);
        System.out.printf("Current value %f%n", value2);
        System.out.printf("Current String %s%n", value3);
        System.out.printf("Current char %c%n", value4);
        System.out.printf("Current boolean : %b%n", value5);

        // use %.2f to use 2 decimal number
        System.out.printf("Current double %.2f%n", value2);
        System.out.printf("Current double %.1f%n", value2);
        System.out.printf("Current double %.4f%n", value2);

    }
}

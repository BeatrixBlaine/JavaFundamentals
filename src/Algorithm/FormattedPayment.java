package Algorithm;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class FormattedPayment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        String yenString = "\u00A5";
        String EuropePrice = "\u20AC";
        NumberFormat nf = NumberFormat.getInstance(Locale.FRANCE);
        String result = nf.format(payment);

        System.out.printf("US: $%,.2f%n", payment);
        System.out.printf("India: Rs.%,.2f%n", payment);
        System.out.printf("China: %s%,.2f%n", yenString,payment);
        System.out.printf("France: %.9s %s%n", result, EuropePrice);

    }
}

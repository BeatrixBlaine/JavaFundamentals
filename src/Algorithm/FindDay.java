package Algorithm;

import javax.xml.transform.Result;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Calendar;
import java.util.Scanner;

public class FindDay {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int month = Integer.parseInt(scan.nextLine());
        int day = Integer.parseInt(scan.nextLine());
        int year = Integer.parseInt(scan.nextLine());

        String result = findDay(month, day, year);
        System.out.println(result);

        scan.close();

    }

    public static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, (month - 1), day);
        String[] days = {
                "SUNDAY",
                "MONDAY",
                "TUESDAY",
                "WEDNESDAY",
                "THURSDAY",
                "FRIDAY",
                "SATURDAY",
        };

        return days[calendar.get(Calendar.DAY_OF_WEEK) - 1];
    }
}

package Application;

import java.util.Calendar;
import java.util.Date;

public class DateApp {
    public static void main(String[] args) {

        // Date
        Date date = new Date();
        System.out.println(date);

        // millisecond constructor
        Date myBirthday = new Date(968868000000L);
        System.out.println(myBirthday);

        // calendar
        Calendar calendar = Calendar.getInstance();
        Date result = calendar.getTime();
        System.out.println(result);

        // modified year to 2013
        calendar.set(Calendar.YEAR, 2013);
        Date result2 = calendar.getTime();
        System.out.println(result2);

    }
}

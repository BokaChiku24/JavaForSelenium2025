package selenium.java.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarClass {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
        System.out.println(simpleDateFormat.format(calendar.getTime()));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println(calendar.get(Calendar.AM_PM));
        System.out.println(calendar.get(Calendar.MINUTE));
    }
}

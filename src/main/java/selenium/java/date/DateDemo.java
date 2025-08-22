package selenium.java.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.toString());

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
        System.out.println("Formatted Date: " + simpleDateFormat.format(date));
        System.out.println("Formatted Date: " + simpleDateFormat2.format(date));

    }
}

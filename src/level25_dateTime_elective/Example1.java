package level25_dateTime_elective;

import java.time.Instant;
import java.util.Date;

public class Example1 {
    public static void main(String[] args) {

        // 1 янв 1970
        Date date = new Date();
        long time = date.getTime();

        System.out.println(time);
        System.out.println(date);

    }
}

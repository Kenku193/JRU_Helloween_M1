package level25_dateTime_elective;

import java.time.LocalTime;
import java.time.temporal.TemporalUnit;

public class Example5 {
    public static void main(String[] args) {

        LocalTime time = LocalTime.now();
        System.out.println(time);

        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        System.out.println(time.getNano());

        LocalTime newTime = time.plusHours(1);
        System.out.println(newTime);

        LocalTime time1 = LocalTime.of(12, 30);
        System.out.println(time1);

    }
}

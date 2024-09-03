package level25_dateTime_elective;

import java.time.LocalDateTime;
import java.time.Month;

public class Example6 {
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDateTime localDateTime1 = LocalDateTime.of(2020, Month.JULY, 1, 22, 12, 00);
        System.out.println(localDateTime1);

    }
}

package level25_dateTime_elective;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class Example8 {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        System.out.println(ZoneId.systemDefault());

    }
}

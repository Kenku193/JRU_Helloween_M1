package level25_dateTime_elective;

import java.time.Instant;

public class Example7 {
    public static void main(String[] args) {

        Instant current = Instant.now();
        System.out.println(current);

        System.out.println(current.getEpochSecond());
        System.out.println(current.getNano());
        System.out.println(current.toEpochMilli());

    }
}

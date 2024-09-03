package level25_dateTime_elective;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
        LocalDate date = LocalDate.parse(new Scanner(System.in).nextLine(), formatter);

        System.out.println(date);

    }
}

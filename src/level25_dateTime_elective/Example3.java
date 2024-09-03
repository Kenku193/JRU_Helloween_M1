package level25_dateTime_elective;

import java.util.Date;

public class Example3 {
    public static void main(String[] args) {

        Date date = new Date();

        System.out.println(date);
        System.out.println("Год:" + date.getYear());
        System.out.println("Месяц:" + date.getMonth());
        System.out.println("День:" + date.getDay());

    }
}

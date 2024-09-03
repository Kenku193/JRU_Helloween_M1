package level25_dateTime_elective;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Example4 {
    public static void main(String[] args) {

        Date current = new Date();
        SimpleDateFormat simpleDateFormat = null;

        simpleDateFormat = new SimpleDateFormat();
        System.out.println("Constructor 1: " + simpleDateFormat.format(current));

        simpleDateFormat = new SimpleDateFormat("dd MMMM yyyy");
        System.out.println("Constructor 2: " + simpleDateFormat.format(current));

        simpleDateFormat = new SimpleDateFormat("dd MMMM yyyy", Locale.FRANCE);
        System.out.println("Constructor 3: " + simpleDateFormat.format(current));

        simpleDateFormat = new SimpleDateFormat("dd MMMM yyyy", myDateFormatSymbols);
        System.out.println("Constructor 4: " + simpleDateFormat.format(current));



    }

    public static DateFormatSymbols myDateFormatSymbols= new DateFormatSymbols() {
        @Override
        public String[] getMonths() {
            return new String[]{"янва-ря", "февра-ля", "мар-та", "апре-ля", "ма-я", "ию-ня", "ию-ля",
            "авгус-та", "сентя-бря", "октя-бря", "ноя-бря", "дека-бря"};
        }
    };
}

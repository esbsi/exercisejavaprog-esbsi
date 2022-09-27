package be.abis.courseadmin.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateUtils {

    static DateTimeFormatter ddMMyyyy = DateTimeFormatter.ofPattern("d/M/yyyy");

    public String formatDdMMyyyy(LocalDate localDate){
        return ddMMyyyy.format(localDate);
    }

/*    public LocalDate parseDdMMyyyy(String dateString){
        return ddMMyyyy.parse(dateString);
    }
*/

    public static DateTimeFormatter getDdMMyyyy() {
        return ddMMyyyy;
    }

    public void setDdMMyyyy(DateTimeFormatter dateTimeFormatter) {
        ddMMyyyy = dateTimeFormatter;
    }
}

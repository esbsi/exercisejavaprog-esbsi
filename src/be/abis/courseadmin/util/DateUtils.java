package be.abis.courseadmin.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateUtils {

    static DateTimeFormatter ddMMyyyy = DateTimeFormatter.ofPattern("d/M/yyyy");

    public static String formatDdMMyyyy(LocalDate localDate){
        return localDate.format(ddMMyyyy);
    }

    public static LocalDate parseDdMMyyyy(String dateString){
        return LocalDate.parse(dateString, ddMMyyyy);
    }


    public static DateTimeFormatter getDdMMyyyy() {
        return ddMMyyyy;
    }

    public void setDdMMyyyy(DateTimeFormatter dateTimeFormatter) {
        ddMMyyyy = dateTimeFormatter;
    }
}

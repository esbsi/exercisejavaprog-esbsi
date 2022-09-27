package be.abis.courseadmin.test;

import be.abis.courseadmin.util.DateUtils;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

public class DateUtilsTest {

    DateTimeFormatter dateTimeFormatter = DateUtils.getDdMMyyyy();
    LocalDate localDate = LocalDate.now();

    @Test
    void dateShouldBeToday(){
        assertEquals("27/9/2022", dateTimeFormatter.format(localDate));

    }



}

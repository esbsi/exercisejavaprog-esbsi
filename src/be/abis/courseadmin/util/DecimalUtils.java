package be.abis.courseadmin.util;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class DecimalUtils {

    public static DecimalFormat belgianDecimalFormat(){
        DecimalFormatSymbols belgianDecimalFormatSymbols = new DecimalFormatSymbols();
        belgianDecimalFormatSymbols.setDecimalSeparator(',');
        belgianDecimalFormatSymbols.setGroupingSeparator('.');
        return new DecimalFormat("#,##0.00", belgianDecimalFormatSymbols);
    }

    public static String format(double d){
        DecimalFormat belgianDecimalFormat = belgianDecimalFormat();
        return belgianDecimalFormat.format(d);
    }

}

package be.abis.courseadmin.util;

import be.abis.courseadmin.lambda.Calculator;

public class CalculatorUtils {

    public static double callCalculator(Calculator c, double d, int i){

        return c.calculate(d, i);
    }

}

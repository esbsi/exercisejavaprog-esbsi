package be.abis.courseadmin.model;

import be.abis.courseadmin.lambda.Calculator;
import be.abis.courseadmin.lambda.Reduction;
import be.abis.courseadmin.util.CalculatorUtils;

public class Course {

    private String title;
    private int days;
    private double priceDay;
    private int reductionPercent = 15;


    public void setDays(int days) {
        this.days = days;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setPriceDay(double priceDay) {
        this.priceDay = priceDay;
    }

    public String getTitle() {
        return title;
    }
    public int getDays() {
        return days;
    }
    public double getPriceDay() {
        return priceDay;
    }


    public Course (String title, int days, double priceDay) {
        this.title=title;
        this.days=days;
        this.priceDay=priceDay;
    }

    public void printInfo(){
        System.out.println("\n" + title + ", " + days + " days, " + priceDay + " euros/day. Total: " + calculateTotalPrice(15) + " euros. After " + reductionPercent + "% reduction: " + calculateTotalPrice(reductionPercent) + " euros.");
    }

    public double calculateTotalPrice() {
        return priceDay * days;
    }

/*    public double calculateTotalPrice(double reductionPercent) {
        return priceDay * days * (1 - reductionPercent/100);
    }
*/

    public double calculateTotalPrice(int reductionPercentage) {
        double price = calculateTotalPrice();
        return CalculatorUtils.callCalculator(((a, b) -> a * (1-b/100.0)), price, reductionPercentage);
    }

    @Override
    public String toString() {
        return title;
    }



}

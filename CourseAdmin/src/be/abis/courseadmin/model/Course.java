package be.abis.courseadmin.model;

public class Course {

    private String title;
    private int days;
    private double priceDay;

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
        System.out.println(title + ", " + days + " days, " + priceDay + " euros/day.");
    }

    public double calculateTotalPrice() {
        double totalPrice = priceDay * days;
        System.out.println(totalPrice);
        return totalPrice;
    }
}

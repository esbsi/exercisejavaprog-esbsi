package be.abis.courseadmin.model;

public class Consultancy extends Service {

    private String title;

    public Consultancy(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public final double calculatePrice() {
        System.out.println("The price for the " + this.getClass().getSimpleName() + " is " + price + ".");
        return price;
    }

}

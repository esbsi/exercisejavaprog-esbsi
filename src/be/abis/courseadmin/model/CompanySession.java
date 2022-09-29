package be.abis.courseadmin.model;
import be.abis.courseadmin.exception.PriceTooHighException;

import java.time.LocalDate;

public class CompanySession extends Session {

    private Company organizer;
    private int participants;


    public CompanySession(Course course, int participants) {
        super(course);
        this.participants = participants;
    }

    public CompanySession(Course course, LocalDate start, Company location, Person instructor, Company organiser) {
        super(course, start, location, instructor);
        this.organizer = organiser;
    }
    public CompanySession(Course course, LocalDate start, Company location, Person instructor, Company organiser, int participants) {
        super(course, start, location, instructor);
        this.organizer = organiser;
        this.participants = participants;
    }


    public Company getOrganizer() {
        return organizer;
    }

    public void setOrganizer(Company organizer) {
        this.organizer = organizer;
    }

    public int getParticipants() {
        return participants;
    }

    public void setParticipants(int participants) {
        this.participants = participants;
    }


    public void printInfo() {
        super.printInfo();
        System.out.println("This session is offered to you by " + organizer.getName() + "." + (participants==0? "" : " There will be " + participants + " participants."));
    }

    @Override
    public double calculatePrice() throws PriceTooHighException {
        this.price = participants * this.getCourse().getDays() * this.getCourse().getPriceDay();
        if (price > 70000){
            throw new PriceTooHighException("The calculated price seems exceptionally high, please contact us.");
        } else {
            System.out.println("The price for the " + this.getClass().getSimpleName() + " is " + price + ".");
            return price;
        }
    }


}

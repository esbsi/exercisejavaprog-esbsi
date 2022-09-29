package be.abis.courseadmin.model;

import be.abis.courseadmin.exception.PriceTooHighException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import be.abis.courseadmin.util.DateUtils;
import be.abis.courseadmin.util.DecimalUtils;

public abstract class Session extends Service {

    private Course course;
    private LocalDate startDate;
    private Company location;
    private Person instructor;
//    private DateUtils dateUtils;
    private DateTimeFormatter dateTimeFormatter = DateUtils.getDdMMyyyy();



    public Session(Course course) {
        this.course = course;
    }

    public Session(Course course, LocalDate startDate, Company location, Person instructor) {
        this.course = course;
        this.startDate = startDate;
        this.location = location;
        this.instructor = instructor;
    }

    public abstract Company getOrganizer();

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public Company getLocation() {
        return location;
    }

    public void setLocation(Company location) {
        this.location = location;
    }

    public Person getInstructor() {
        return instructor;
    }

    public void setInstructor(Person instructor) {
        this.instructor = instructor;
    }

    public void printInfo(){
        System.out.println("The " + course.getTitle() + " course will start on " + dateTimeFormatter.format(startDate) + ". It will take place at " + location.getName() + ". Your instructor is " + instructor.getFirstName() + " " + instructor.getLastName() + " of " + instructor.getCompany().getName() + ".");
    }


    public double calculatePrice() throws PriceTooHighException {
        System.out.println("The price for the " + this.getClass().getSimpleName() + " is " + DecimalUtils.format(price) + ".");
        return price;

    }



}

// DecimalUtils.belgianDecimalFormat(price)
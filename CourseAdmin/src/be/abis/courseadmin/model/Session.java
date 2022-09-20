package be.abis.courseadmin.model;

public abstract class Session extends Service {

    private Course course;
    private String start;
    private Company location;
    private Person instructor;


    public Session(Course course, String start, Company location, Person instructor) {
        this.course = course;
        this.start = start;
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

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
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
        System.out.println("The " + course.getTitle() + " course will start on " + start + ". It will take place at " + location.getName() + ". Your instructor is " + instructor.getFirstName() + " " + instructor.getLastName() + " of " + instructor.getCompany().getName() + ".");
    }


    public double calculatePrice() {
        System.out.println("The price for the " + this.getClass().getSimpleName() + " is " + price + ".");
        return price;
    }



}

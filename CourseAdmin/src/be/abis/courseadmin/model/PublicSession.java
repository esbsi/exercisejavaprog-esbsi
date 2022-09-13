package be.abis.courseadmin.model;

public class PublicSession extends Session {


    private final static Company ABIS = new Company("ABIS");
    private Company organizer = ABIS;

    public PublicSession(Course course, String start, Company location, Person instructor) {
        super(course, start, location, instructor);
    }

    @Override
    public Company getOrganizer() {
        return organizer;
    }


    public void printInfo() {
        super.printInfo();
    }


}

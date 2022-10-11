package be.abis.courseadmin.model;

public interface CourseParticipant {

    void attendCourse(Course c);

    int compareTo(Person person);
    static void printNameAndCompany(CourseParticipant participant){
        Person person = (Person)participant;
        System.out.println(person.getFirstName() + " " + person.getLastName() + " " + person.getCompany());
    }

}

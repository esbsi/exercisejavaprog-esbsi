package be.abis.courseadmin.model;

import be.abis.courseadmin.enums.Gender;
import be.abis.courseadmin.util.StringUtils;

public class Person implements Instructor, CourseParticipant {


    private String firstName;
    private String lastName;
    private Gender gender;
    private Company company;
    private String[] hobbies = new String[10];
    private String role;





/*    public Person(String firstName, String lastName, Company company) {
        this(firstName, lastName);
        this.company = company;
    }
*/

    public Person(String firstName, String lastName, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public Person(String firstName, String lastName, Gender gender, Company company) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.company = company;
    }


    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String[] getHobbies() {
        return hobbies;
    }
    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }



    public void addHobby(String hobby) {
        for (String act : hobbies) {
            act = (act==null ? hobby : act );
        }
    }


    @Override
    public void teachCourse(Course c) {
        role = "instructor";
        System.out.println(firstName + lastName + " is teaching " + c.getTitle());
    }

    @Override
    public void attendCourse(Course c) {
        role = "attendant";
        System.out.println(firstName + lastName + " is attending " + c.getTitle());
    }


// C
    public void printInfo(){
        System.out.println(StringUtils.capitalize((gender.getPossessivePronoun() + " name is " + firstName + " " + lastName + ". " + gender.getPersonalPronoun() + (company!=null?(" works for " + company.getName() + "."):" is not linked to a company for the moment."))));
    }



}


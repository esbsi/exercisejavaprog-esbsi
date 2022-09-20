package be.abis.courseadmin.model;

import be.abis.courseadmin.enums.Gender;
import be.abis.courseadmin.util.StringUtils;


/** Person (class) contains the attributes of a person and some related (output) methods.
 * @author Esben
 */


public class Person implements Instructor, CourseParticipant {


    private String firstName;
    private String lastName;
    private Gender gender;
    private Company company;
    private String[] hobbies = new String[10];
    private int hobbiesIndex;
    private String role;
    private static int counter;
    private int personNumber;



    public Person(String firstName, String lastName, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        counter += 1;
        this.personNumber = counter;
    }

    public Person(String firstName, String lastName, Gender gender, Company company) {
        this(firstName, lastName, gender);
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


    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Person.counter = counter;
    }

    public int getPersonNumber() {
        return personNumber;
    }

    public void setPersonNumber(int personNumber) {
        this.personNumber = personNumber;
    }



    public void addHobby(String hobby) {
        hobbies[hobbiesIndex] = hobby;
        hobbiesIndex++;
    }

    public void addHobbies(String... hobbies) {
        for (String hobby : hobbies) {
            this.addHobby(hobby);
        }
    }

    public void printHobbies(){
        System.out.println("Hobbies van " + firstName + " " + lastName + ":");
        for (String hobby : hobbies){
            if (hobby != null) {
                System.out.println(hobby);
            }
        }
    }


        @Override
        public void teachCourse (Course c){
            role = "instructor";
            System.out.println(firstName + lastName + " is teaching " + c.getTitle());
        }

        @Override
        public void attendCourse (Course c){
            role = "attendant";
            System.out.println(firstName + lastName + " is attending a " + c.getTitle() + " course. The total price is "+ c.calculateTotalPrice());
        }


        public void printInfo () {
            System.out.println(StringUtils.capitalize((personNumber + ". " + gender.getPossessivePronoun() + " name is " + firstName + " " + lastName + ". " + gender.getPersonalPronoun() + (company != null ? (" works for " + company.getName() + ".") : " is not linked to a company for the moment."))));
        }

        public int calculateBirthyear () {
            return 2022 - 40;
        }


        @Override
        public String toString() {
            return firstName + " " + lastName;
        }



}


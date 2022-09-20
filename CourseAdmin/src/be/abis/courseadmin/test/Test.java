package be.abis.courseadmin.test;

import be.abis.courseadmin.repository.CompanyRepository;
import be.abis.courseadmin.repository.MemoryArrayCompanyRepository;
import be.abis.courseadmin.enums.Gender;
import be.abis.courseadmin.model.Person;
import be.abis.courseadmin.model.Service;
import be.abis.courseadmin.model.*;
import be.abis.courseadmin.util.StringUtils;

public class Test {
    public static void main(String[] args) {



/* These are the courses. */

        Course javaDev = new Course("Java", 5, 300.55);
        javaDev.printInfo();
        javaDev.calculateTotalPrice();


/* These are the companies. */

        MemoryArrayCompanyRepository companies = new MemoryArrayCompanyRepository();

        Company ttl = companies.findCompany("TTL");
        Company abis = companies.findCompany("ABIS");
        Company ibm = companies.findCompany("IBM");
        System.out.println(ibm);


/* These are the persons. */

        Person maryJones = new Person("Mary", "Jones", Gender.FEMALE, abis);
        Person bobJanssens = new Person("Bob", "Janssens", Gender.MALE, ttl);
        Person johnDoe = new Person("John", "Doe", Gender.MALE);

        Person[] persons = {maryJones, bobJanssens, johnDoe};


        System.out.println("\n" + Person.getCounter() + " Persons created.");
        for (Person person : persons) {
            person.printInfo();
        }


        johnDoe.addHobby("Tennis");
        bobJanssens.addHobbies("Basket", "Lopen", "Zwemmen");
        maryJones.addHobby("Schaken");

        johnDoe.printHobbies();
        bobJanssens.printHobbies();


//incomplete        System.out.println(johnDoe.getHobbies());




        PublicSession java1 = new PublicSession(javaDev, "05/09/2022", abis, maryJones);
        CompanySession javaIbm1 = new CompanySession(javaDev, "24/10/2022", abis, bobJanssens, ibm, 5);

        Session[] javaSessions = {java1, javaIbm1};
        for (Session session : javaSessions) {
            session.calculatePrice();
            session.printInfo();
        }

        Consultancy advice = new Consultancy("Advice");

        Service[] servicesJava = {java1, javaIbm1, advice};
        for (Service service : servicesJava) {
            service.calculatePrice();
            if (service instanceof Session) {
              ((Session) service).printInfo();
            }
        }


        maryJones.attendCourse(javaDev);
        maryJones.teachCourse(javaDev);
        System.out.println(maryJones.getRole());

        System.out.println(maryJones);
        System.out.println(abis);
        System.out.println(javaDev);








    }
}

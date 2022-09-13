package be.abis.courseadmin.test;

import be.abis.courseadmin.enums.Gender;
import be.abis.courseadmin.model.Service;
import be.abis.courseadmin.util.StringUtils;

public class Test {
    public static void main(String[] args) {
        be.abis.courseadmin.model.Course javaDev = new be.abis.courseadmin.model.Course("Java", 5, 300.55);
        javaDev.printInfo();
        javaDev.calculateTotalPrice();

/* These are the companies. */

        be.abis.courseadmin.model.Company ttl = new be.abis.courseadmin.model.Company("TTL");
        be.abis.courseadmin.model.Company abis = new be.abis.courseadmin.model.Company("ABIS");
        be.abis.courseadmin.model.Company ibm = new be.abis.courseadmin.model.Company("IBM");
        ttl.printInfo();

/* These are the persons. */

        be.abis.courseadmin.model.Person maryJones = new be.abis.courseadmin.model.Person("Mary", "Jones", Gender.FEMALE, abis);
        be.abis.courseadmin.model.Person bobJanssens = new be.abis.courseadmin.model.Person("Bob", "Janssens", Gender.MALE, ttl);
        be.abis.courseadmin.model.Person johnDoe = new be.abis.courseadmin.model.Person("John", "Doe", Gender.MALE);
        maryJones.printInfo();
        johnDoe.printInfo();

        johnDoe.addHobby("Tennis");
        bobJanssens.addHobby("Basket");
        bobJanssens.addHobby("Lopen");
        maryJones.addHobby("Schaken");

        System.out.println(johnDoe.getHobbies());


        be.abis.courseadmin.model.PublicSession java1 = new be.abis.courseadmin.model.PublicSession(javaDev, "05/09/2022", abis, maryJones);
        java1.printInfo();

        be.abis.courseadmin.model.CompanySession javaIbm1 = new be.abis.courseadmin.model.CompanySession(javaDev, "24/10/2022", abis, bobJanssens, ibm, 5);
        javaIbm1.printInfo();

        be.abis.courseadmin.model.Session[] javaSessions = {java1, javaIbm1};
        for (be.abis.courseadmin.model.Session session : javaSessions) {
            session.printInfo();
            session.calculatePrice();
        }

        be.abis.courseadmin.model.Consultancy advice = new be.abis.courseadmin.model.Consultancy("Advice");

        Service[] servicesJava = {java1, javaIbm1, advice};
        for (Service service : servicesJava) {
            service.calculatePrice();
            if (service instanceof be.abis.courseadmin.model.Session) {
              ((be.abis.courseadmin.model.Session) service).printInfo();
            }
        }


        maryJones.attendCourse(javaDev);
        maryJones.teachCourse(javaDev);
        System.out.println(maryJones.getRole());


        String testString = "this sentence. should be capitalized. ";
        StringUtils.capitalize(testString);

        System.out.println("This has been written by Clau for testing");
        System.out.println("all ur base r belong2us");
        System.out.println("Conflict generator");



    }
}

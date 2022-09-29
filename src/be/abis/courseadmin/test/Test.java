package be.abis.courseadmin.test;

import be.abis.courseadmin.exception.CompanyNotFoundException;
import be.abis.courseadmin.exception.PriceException;
import be.abis.courseadmin.exception.PriceTooHighException;
import be.abis.courseadmin.exception.PriceTooLowException;
import be.abis.courseadmin.lambda.Calculator;
import be.abis.courseadmin.repository.CompanyRepository;
import be.abis.courseadmin.repository.FileCompanyRepository;
import be.abis.courseadmin.repository.MemoryArrayCompanyRepository;
import be.abis.courseadmin.enums.Gender;
import be.abis.courseadmin.model.Person;
import be.abis.courseadmin.model.Service;
import be.abis.courseadmin.model.*;
import be.abis.courseadmin.repository.MemoryListCompanyRepository;
import be.abis.courseadmin.util.StringUtils;

import java.time.LocalDate;
import java.util.List;

public class Test {
    public static void main(String[] args) throws CompanyNotFoundException {



/* These are the courses. */
        Course scrumIntro = new Course("Scrum intro", 1, 500);
        Course javaDev = new Course("Java", 5, 300.55);
        javaDev.printInfo();
        javaDev.calculateTotalPrice();


/* These are the companies. */



        CompanyRepository companies = new FileCompanyRepository();

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



/*        PublicSession java1 = new PublicSession(javaDev, LocalDate.parse("5/9/2022"), abis, maryJones);
        CompanySession javaIbm1 = new CompanySession(javaDev, LocalDate.parse("24/10/2022"), abis, bobJanssens, ibm, 5);

        Session[] javaSessions = {java1, javaIbm1};
        for (Session session : javaSessions) {
            try {
                session.calculatePrice();
            } catch (PriceTooHighException priceTooHighException){
                System.out.println(priceTooHighException.getMessage());
            }
            session.printInfo();
        }

        Consultancy advice = new Consultancy("Advice");

        Service[] servicesJava = {java1, javaIbm1, advice};
        for (Service service : servicesJava) {
            try {
                service.calculatePrice();
            } catch (PriceTooHighException priceTooHighException){
                System.out.println(priceTooHighException.getMessage());
            }
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

        abis.setPriceTooLowExceptionBelowThisSessionPrice(1500);

        try {
            ibm.requestPriceOfferForCompanySession(scrumIntro, 2, maryJones);
        } catch (PriceException priceTooLowException){
            System.out.println(priceTooLowException.getMessage());
        }
*/

        CompanyRepository cr = new FileCompanyRepository();
        List<Company> companyList = cr.getCompanies();
        for (Company c : companyList){
            System.out.println(c);}

/*        cr.addCompany(ibm);
        for (Company c : cr.getCompanies()){
            System.out.println(c);}
*/
        try {
            System.out.println(cr.findCompany(5).getName());
        } catch (CompanyNotFoundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(cr.findCompany("ttl").getCompanyNumber());

        Calculator calculator = (a, b) -> a*b;
        System.out.println(calculator.calculate(2.5, 3));

 /*
        {
            @Override
            public Double calculate(Double a, int b) {
                return null;
            }
        }
 */
        System.out.println(javaDev.calculateTotalPrice());
        System.out.println(javaDev.calculateTotalPrice(25));

//        System.out.println("elefant".(1,3););



    }
}

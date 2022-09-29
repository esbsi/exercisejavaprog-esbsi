package be.abis.courseadmin.test;

import be.abis.courseadmin.exception.*;
import be.abis.courseadmin.lambda.Calculator;
import be.abis.courseadmin.repository.CompanyRepository;
import be.abis.courseadmin.repository.FileCompanyRepository;
import be.abis.courseadmin.repository.MemoryArrayCompanyRepository;
import be.abis.courseadmin.enums.Gender;
import be.abis.courseadmin.model.Person;
import be.abis.courseadmin.model.Service;
import be.abis.courseadmin.model.*;
import be.abis.courseadmin.repository.MemoryListCompanyRepository;
import be.abis.courseadmin.service.AbisCompanyService;
import be.abis.courseadmin.util.DateUtils;
import be.abis.courseadmin.util.StringUtils;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) throws CompanyNotFoundException, PriceTooHighException, CompanyAlreadyExistsException {



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
        bobJanssens.addHobbies("Basket", "Lopen", "Zwemmen", "Lopen");
        maryJones.addHobby("Schaken");

        johnDoe.printHobbies();
        bobJanssens.printHobbies();



        PublicSession java1 = new PublicSession(javaDev, DateUtils.parseDdMMyyyy("5/9/2022"), abis, maryJones);
        CompanySession javaIbm1 = new CompanySession(javaDev, DateUtils.parseDdMMyyyy("24/10/2022"), abis, bobJanssens, ibm, 5);

/*       Session[] javaSessions = {java1, javaIbm1};
        for (Session session : javaSessions) {
            try {
                session.calculatePrice();
            } catch (PriceTooHighException priceTooHighException){
                System.out.println(priceTooHighException.getMessage());
            }
            session.printInfo();
        }
*/
        Consultancy advice = new Consultancy("Advice");

        Service[] servicesJava = {java1, javaIbm1, advice};
 /*       for (Service service : servicesJava) {
            try {
                service.calculatePrice();
            } catch (PriceTooHighException priceTooHighException){
                System.out.println(priceTooHighException.getMessage());
            }
            if (service instanceof Session) {
              ((Session) service).printInfo();
            }
        }
*/

        maryJones.attendCourse(javaDev);
        maryJones.teachCourse(javaDev);

        abis.setPriceTooLowExceptionBelowThisSessionPrice(1500);

/*        try {
            ibm.requestPriceOfferForCompanySession(scrumIntro, 2, maryJones);
        } catch (PriceException priceTooLowException){
            System.out.println(priceTooLowException.getMessage());
        }
*/





        Company asml = new Company("ASML");
        Company ablynx = new Company("Ablynx");
        CompanyRepository cr = new FileCompanyRepository();
        cr.addCompany(ablynx);

        System.out.println(cr.getCompanies());


        AbisCompanyService abisCompanyService = new AbisCompanyService();
 /*       System.out.println(abisCompanyService.sortAllCompaniesByName());

        System.out.println(abisCompanyService.sortAllCompaniesByNumber());

        List<Company> companies1 = cr.getCompanies();
        Collections.sort(companies1, new Company.SortAllCompaniesByNumberReversedComparator());
        System.out.println(companies1);
*/

        java1.printInfo();
        java1.calculatePrice();



    }
}

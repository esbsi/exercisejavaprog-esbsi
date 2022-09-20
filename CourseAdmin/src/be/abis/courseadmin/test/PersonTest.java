package be.abis.courseadmin.test;

import be.abis.courseadmin.enums.Gender;

import be.abis.courseadmin.model.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person p = new Person("Kat", "Stevens", Gender.FEMALE);

    @Test
    void  birthyearShouldBe82() {

//        Person p = new Person("Kat", "Stevens", Gender.FEMALE);
        assertEquals (1982, p.calculateBirthyear());

    }

/*    @Test
    void  hobbyShouldBeGolf() {


        assertEquals (1982, p.calculateBirthyear());

    }
*/

}
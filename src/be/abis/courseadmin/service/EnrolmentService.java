package be.abis.courseadmin.service;

import be.abis.courseadmin.model.CourseParticipant;
import be.abis.courseadmin.model.Person;

import java.util.List;

public interface EnrolmentService {

    List<CourseParticipant> sortByPersonNumber(List<CourseParticipant> participants);
    void sortByLastName(List<Person> participants);
    void sortByFirstName(List<Person> participants);
    void sortByLastThenFirstName(List<CourseParticipant> participants);
}

package be.abis.courseadmin.service;

import be.abis.courseadmin.model.CourseParticipant;
import be.abis.courseadmin.model.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AbisEnrolmentService implements EnrolmentService {

    @Override
    public List<CourseParticipant> sortByPersonNumber(List<CourseParticipant> participants) {
        return participants.stream()
                .map(courseParticipant -> (Person)courseParticipant)
                .sorted()
                .map(person -> (CourseParticipant)person)
                .collect(Collectors.toList());
    }

    @Override
    public void sortByLastName(List<Person> participants){
        Collections.sort(participants, Comparator.comparing(Person::getLastName));
    }

    @Override
    public void sortByFirstName(List<Person> participants){
        Collections.sort(participants, Comparator.comparing(Person::getFirstName));
    }

    @Override
    public void sortByLastThenFirstName(List<CourseParticipant> participants){
        Collections.sort(participants, Comparator.comparing(p -> ((Person)p).getLastName() + ((Person)p).getFirstName()));
    }




}

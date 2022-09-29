package be.abis.courseadmin.test;

import be.abis.courseadmin.model.Course;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class CourseTest {

    @Test
    void calculateTotalPrice() {

        Course course = new Course("TestCourse", 10, 50);

        assertEquals (500, course.calculateTotalPrice());

    }
}
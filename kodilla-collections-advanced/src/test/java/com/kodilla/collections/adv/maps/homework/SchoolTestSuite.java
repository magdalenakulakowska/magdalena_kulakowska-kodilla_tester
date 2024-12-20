package com.kodilla.collections.adv.maps.homework;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTestSuite {

    @Test
    void testConstructorAndGetters() {
        School school = new School("ABC High School", Arrays.asList(30, 25, 28, 32));

        assertEquals("ABC High School", school.getSchoolName());
        assertEquals(Arrays.asList(30, 25, 28, 32), school.getStudentsInClasses());
    }

    @Test
    void testGetAllStudents() {
        School school = new School("XYZ School", Arrays.asList(20, 15, 22, 18));

        int totalStudents = school.getAllStudents();

        assertEquals(75, totalStudents);
    }

    @Test
    void testGetAllStudentsWithEmptyList() {
        School school = new School("Empty School", List.of());

        int totalStudents = school.getAllStudents();

        assertEquals(0, totalStudents);
    }

    @Test
    void testGetAllStudentsWithOneClass() {
        School school = new School("Single Class School", List.of(100));

        int totalStudents = school.getAllStudents();

        assertEquals(100, totalStudents);
    }
}
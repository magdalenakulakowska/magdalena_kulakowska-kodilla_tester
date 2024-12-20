package com.kodilla.collections.adv.maps.complex;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GradesTestSuite {

    @Test
    void testConstructorAndAverage() {
        List<Double> gradesList = Arrays.asList(90.0, 80.0, 70.0, 85.0, 95.0);

        Grades grades = new Grades(gradesList);

        assertEquals(84.0, grades.getAverage());
    }

    @Test
    void testToString() {
        List<Double> gradesList = Arrays.asList(90.0, 80.0, 70.0, 85.0, 95.0);
        Grades grades = new Grades(gradesList);

        String result = grades.toString();

        assertEquals("Grades: [90.0, 80.0, 70.0, 85.0, 95.0]", result);
    }

    @Test
    void testGetAverageSingleGrade() {
        List<Double> singleGrade = List.of(100.0);

        Grades grades = new Grades(singleGrade);

        assertEquals(100.0, grades.getAverage());
    }
}
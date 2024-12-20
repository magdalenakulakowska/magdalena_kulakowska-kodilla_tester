package com.kodilla;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradesTestSuite {

    @Test
    void testAddAndLastAddedGrade() {
        Grades grades = new Grades();

        grades.add(85);
        grades.add(90);
        grades.add(78);

        assertEquals(78, grades.lastAddedGrade());
    }

    @Test
    void testAverageGrade() {
        Grades grades = new Grades();

        grades.add(85);
        grades.add(90);
        grades.add(78);

        float expectedAverage = (85 + 90 + 78) / 3.0f;
        assertEquals(expectedAverage, grades.averageGrade(), 0.01);
    }

    @Test
    void testAddMoreThanMaxGrades() {
        Grades grades = new Grades();

        for (int i = 0; i < 15; i++) {
            grades.add(100);
        }

        assertEquals(100, grades.lastAddedGrade());
        assertEquals(100.0, grades.averageGrade(), 0.01);
    }
}
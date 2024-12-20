package com.kodilla.collections.adv.maps.complex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTestSuite {
    Student student = new Student("John", "Doe");

    @Test
    void testConstructorAndGetters() {
        assertEquals("John", student.getFirstName());
        assertEquals("Doe", student.getLastName());
    }

    @Test
    void testEquals() {
        Student student2 = new Student("John", "Doe");
        Student student3 = new Student("Jane", "Doe");

        assertEquals(student, student2);
        assertNotEquals(student, student3);
    }

    @Test
    void testHashCode() {
        Student student2 = new Student("John", "Doe");

        assertEquals(student.hashCode(), student2.hashCode());
    }

    @Test
    void testToString() {
        Student student = new Student("John", "Doe");

        String result = student.toString();

        assertEquals("Student{firstName='John', lastName='Doe'}", result);
    }
}
package com.kodilla;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class StudentTestSuite {

    @Test
    void testCheckStudentAgeAndHeightOlderAndTaller() {
        Student student = new Student("John", 35, 170);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        student.checkStudentAgeAndHeight();

        String expectedOutput = "com.kodilla.User is older than 30 and taller than 160cm";
        assertEquals(expectedOutput, outputStream.toString().trim());
    }

    @Test
    void testCheckStudentAgeAndHeightYoungerOrShorter() {
        Student student = new Student("Jane", 25, 150);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        student.checkStudentAgeAndHeight();

        String expectedOutput = "com.kodilla.User is 30 (or younger) or 160cm (or shorter)";
        assertEquals(expectedOutput, outputStream.toString().trim());
    }

    @Test
    void testCheckStudentAgeAndHeightWithNullName() {
        Student student = new Student(null, 35, 170);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        student.checkStudentAgeAndHeight();

        assertEquals("", outputStream.toString().trim());
    }
}
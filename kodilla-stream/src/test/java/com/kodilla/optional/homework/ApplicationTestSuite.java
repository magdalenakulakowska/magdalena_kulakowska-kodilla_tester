package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTestSuite {

    @Test
    public void testStudentWithTeacher(){
        Teacher teacher = new Teacher("Jarosław Jaworski");
        Student student = new Student("Anna Kowalska", teacher);

        assertEquals("Anna Kowalska", student.getName());
        assertEquals("Jarosław Jaworski", student.getTeacher().getName());
    }

    @Test
    public void testStudentWithoutTeacher(){
        Student student = new Student("Anna Kowalska", null);

        assertEquals("Anna Kowalska", student.getName());
        assertNull(student.getTeacher());
    }

    @Test
    public void testStudentsList(){
        List<Student> students = new ArrayList<>();

        Teacher teacher = new Teacher("Jarosław Jaworski");

        Student student1 = new Student("Anna Kowalska", teacher);
        Student student2 = new Student("Adam Rybak", null);

        students.add(student1);
        students.add(student2);

        assertEquals("Anna Kowalska", students.getFirst().getName());
        assertEquals("Jarosław Jaworski", students.getFirst().getTeacher().getName());

        assertEquals("Adam Rybak", students.getLast().getName());
        assertNull(students.getLast().getTeacher());
    }

    @Test
    public void testStudentsListWithOptionalPresentTeacher(){
        List<Student> students = new ArrayList<>();

        Teacher teacher1 = new Teacher("Jarosław Jaworski");

        Student student1 = new Student("Anna Kowalska", teacher1);
        Student student2 = new Student("Adam Rybak", null);

        students.add(student1);
        students.add(student2);

        Optional<Teacher> optionalTeacher = Optional.ofNullable(students.getFirst().getTeacher());

        assertTrue(optionalTeacher.isPresent());
    }

    @Test
    public void testStudentsListWithOptionalNotPresentTeacher(){
        List<Student> students = new ArrayList<>();

        Teacher teacher1 = new Teacher("Jarosław Jaworski");

        Student student1 = new Student("Anna Kowalska", teacher1);
        Student student2 = new Student("Adam Rybak", null);

        students.add(student1);
        students.add(student2);

        Optional<Teacher> optionalTeacher = Optional.ofNullable(students.getLast().getTeacher());

        assertFalse(optionalTeacher.isPresent());
    }

    @Test
    public void testStudentsListWithOptionalPresentTeacherNullHandling(){
        List<Student> students = new ArrayList<>();

        Teacher teacher1 = new Teacher("Jarosław Jaworski");

        Student student1 = new Student("Anna Kowalska", teacher1);
        Student student2 = new Student("Adam Rybak", null);

        students.add(student1);
        students.add(student2);

        Optional<Teacher> optionalTeacher = Optional.ofNullable(students.getFirst().getTeacher());
        String optionalTeacherName = optionalTeacher.orElse(new Teacher("<undefined>")).getName();

        assertEquals("Jarosław Jaworski", optionalTeacherName);
    }

    @Test
    public void testStudentsListWithOptionalNotPresentTeacherNullHandling(){
        List<Student> students = new ArrayList<>();

        Teacher teacher1 = new Teacher("Jarosław Jaworski");

        Student student1 = new Student("Anna Kowalska", teacher1);
        Student student2 = new Student("Adam Rybak", null);

        students.add(student1);
        students.add(student2);

        Optional<Teacher> optionalTeacher = Optional.ofNullable(students.getLast().getTeacher());
        String optionalTeacherName = optionalTeacher.orElse(new Teacher("<undefined>")).getName();

        assertEquals("<undefined>", optionalTeacherName);
    }
}
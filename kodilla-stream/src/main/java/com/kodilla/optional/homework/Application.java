package com.kodilla.optional.homework;

import com.kodilla.stream.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        Teacher jaroslaw = new Teacher("Jarosław Jaworski");
        Teacher monika = new Teacher("Monika Lasota");

        students.add(new Student("Anna Kowalska", jaroslaw));
        students.add(new Student("Adam Rybak", null));
        students.add(new Student("Joanna Doe", jaroslaw));
        students.add(new Student("Karol Jasny", monika));
        students.add(new Student("Albert Marcello", null));
        students.add(new Student("Karolina Barc", monika));

        for(Student student : students){
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());

            String teacherName = optionalTeacher.orElse(new Teacher("<undefined>")).getName();

            System.out.println("Student: " + student.getName() + ", teacher: " + teacherName);
        }
     }
}

package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String schoolName;
    private List<Integer> studentsInClasses = new ArrayList<>();

    public School(String schoolName, List<Integer> studentsInClasses) {
        this.schoolName = schoolName;
        this.studentsInClasses = studentsInClasses;
    }

    public int getAllStudents () {
        int sum = 0;

        for(int studentsInClass : studentsInClasses){
            sum += studentsInClass;
        }

        return sum;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public List<Integer> getStudentsInClasses() {
        return studentsInClasses;
    }
}

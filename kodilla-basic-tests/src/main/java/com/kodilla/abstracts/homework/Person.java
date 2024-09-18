package com.kodilla.abstracts.homework;

import java.util.Arrays;

public class Person {
    private String firstName;
    private int age;
    private Job job;

    public Person (String firstName, int age, Job job){
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public void displayResponsibilities (){
        System.out.println(this.firstName + " responsibilities are: " + Arrays.toString(this.job.getResponsibilities()));
    }
}

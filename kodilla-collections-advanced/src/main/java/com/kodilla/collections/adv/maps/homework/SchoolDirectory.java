package com.kodilla.collections.adv.maps.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schoolsDirectory = new HashMap<>();

        Principal adam = new Principal("Adam", "Jelionek");
        Principal anna = new Principal("Anna", "Jabłonowicz");
        Principal aleksander = new Principal("Aleksander", "Malewicz");

        School adamSchool = new School("Wesołe kredki", Arrays.asList(13, 15, 12, 17, 20, 10, 14));
        School annaSchool = new School("Zielona szkoła", Arrays.asList(8, 12, 10, 11));
        School aleksanderSchool = new School("Szkoła muzyczna", Arrays.asList(5, 6, 4, 8, 6));

        schoolsDirectory.put(adam, adamSchool);
        schoolsDirectory.put(anna, annaSchool);
        schoolsDirectory.put(aleksander, aleksanderSchool);

        for(Map.Entry<Principal, School> schoolDirectoryEntry : schoolsDirectory.entrySet()){
            System.out.println(schoolDirectoryEntry.getKey().getFirstName() + " " +
                    schoolDirectoryEntry.getKey().getLastName() + " is principal of "
                    + schoolDirectoryEntry.getValue().getSchoolName() + " school with " + schoolDirectoryEntry.getValue().getAllStudents() + " students. ");
        }
    }
}

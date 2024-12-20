package com.kodilla.abstracts.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTestSuite {
    Person person = new Person("Magdalena", 25,
            new Job(7200,  new String[]{"Responsibility 1", "Responsibility 2", "Responsibility 3"}));

    @Test
    void testDisplayResponsibilities() {
        String responsibilities = "Magdalena responsibilities are: [Responsibility 1, Responsibility 2, Responsibility 3]";

        assertEquals(responsibilities, person.displayResponsibilities());
    }
}
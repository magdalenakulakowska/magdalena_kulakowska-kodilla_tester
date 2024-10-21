package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class PersonTestSuite {
    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonSources#providePersonInfoForTestingBMI")
    public void testGetBMI(double heightInMeters, double weightInKilogram, String expectedBMI){
        Person person = new Person(heightInMeters, weightInKilogram);

        String BMI = person.getBMI();

        assertEquals(expectedBMI, BMI);
    }

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonSources#provideInvalidPersonInfoForTestingBMI")
    public void testGetBMI_withException(double heightInMeters, double weightInKilogram){
        Person person = new Person(heightInMeters, weightInKilogram);

        assertThrows(InvalidPersonDataException.class, () -> person.getBMI());
    }
}
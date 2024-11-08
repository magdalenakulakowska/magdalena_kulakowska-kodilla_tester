package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.MockedStatic;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import java.time.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mockStatic;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class CarFactoryTestSuite {

    @Test
    public void shouldReturnCabrioInSummer(){
        LocalDateTime time = LocalDateTime.of(2023, Month.JUNE, 23, 12, 0, 0);

        try (MockedStatic<LocalDateTime> mockedStatic = mockStatic(LocalDateTime.class)) {
            mockedStatic.when(LocalDateTime::now).thenReturn(time);
            ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration");

            Car car = (Car) context.getBean("selectCarBySeason");

            assertEquals("Cabrio", car.getCarType());
        }
    }

    @Test
    public void shouldReturnSUVInWinter() {
        LocalDateTime time = LocalDateTime.of(2023, Month.DECEMBER, 23, 12, 0, 0);

        try (MockedStatic<LocalDateTime> mockedStatic = mockStatic(LocalDateTime.class)) {
            mockedStatic.when(LocalDateTime::now).thenReturn(time);
            ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration");

            Car car = (Car) context.getBean("selectCarBySeason");

            assertEquals("SUV", car.getCarType());
        }
    }

    @Test
    public void shouldReturnSedanInOtherSeasons(){
        LocalDateTime time = LocalDateTime.of(2023, Month.OCTOBER, 23, 12, 0, 0);

        try (MockedStatic<LocalDateTime> mockedStatic = mockStatic(LocalDateTime.class)) {
            mockedStatic.when(LocalDateTime::now).thenReturn(time);
            ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration");

            Car car = (Car) context.getBean("selectCarBySeason");

            assertEquals("Sedan", car.getCarType());
        }
    }

    @Test
    public void shouldHaveLightsOff(){
        LocalDateTime time = LocalDateTime.of(2023, Month.DECEMBER, 23, 12, 0, 0);

        try (MockedStatic<LocalDateTime> mockedStatic = mockStatic(LocalDateTime.class)) {
            mockedStatic.when(LocalDateTime::now).thenReturn(time);
            ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration");

            Car car = (Car) context.getBean("selectCarBySeason");

            assertFalse(car.hasHeadlightsTurnedOn());
        }
    }

    @Test
    public void shouldHaveLightsOn(){
        LocalDateTime time = LocalDateTime.of(2023, Month.DECEMBER, 23, 4, 0, 0);

        try (MockedStatic<LocalDateTime> mockedStatic = mockStatic(LocalDateTime.class)) {
            mockedStatic.when(LocalDateTime::now).thenReturn(time);
            ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration");

            Car car = (Car) context.getBean("selectCarBySeason");

            assertTrue(car.hasHeadlightsTurnedOn());
        }
    }
}
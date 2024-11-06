package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import java.time.*;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CarFactoryTestSuite {

//    @TestConfiguration
//    static class TestClockConfig {
//
//        @Bean
//        @Primary
//        public Clock fixedClock() {
//            return Clock.fixed(
//                    LocalDateTime.of(2023, Month.JULY, 15, 14, 0)
//                            .toInstant(ZoneId.systemDefault().getRules().getOffset(Instant.now())),
//                    ZoneId.systemDefault()
//            );
//        }
//    }
//
//
//    @Test
//    public void shouldReturnCabrioInSummer(){
//        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration");
//        Car car = (Car) context.getBean("selectCarBySeason");
//
//        assertEquals("Cabrio", car.getCarType());
//    }

//    @Test // Pytanie na konsultację - jak przetestować inne pory roku z beanem zamiast tworzenia new CarFactory?
//    public void shouldReturnSUVInWinter(){
//        Clock winterClock = Clock.fixed(
//                LocalDateTime.of(2023, Month.DECEMBER, 15, 14, 0)
//                        .toInstant(ZoneId.systemDefault().getRules().getOffset(Instant.now())),
//                ZoneId.systemDefault()
//        );
//        CarFactory winterCarFactory = new CarFactory(winterClock);
//
//        Car car = winterCarFactory.selectCarBySeason();
//
//        assertEquals("SUV", car.getCarType());
//    }
//
//    @Test
//    public void shouldReturnSedanInOtherSeasons(){
//        Clock springClock = Clock.fixed(
//                LocalDateTime.of(2023, Month.APRIL, 15, 14, 0)
//                        .toInstant(ZoneId.systemDefault().getRules().getOffset(Instant.now())),
//                ZoneId.systemDefault()
//        );
//        CarFactory springCarFactory = new CarFactory(springClock);
//
//        Car car = springCarFactory.selectCarBySeason();
//
//        assertEquals("Sedan", car.getCarType());
//    }

//    @Test
//    public void shouldHaveLightsOff(){
//        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration");
//        Car car = (Car) context.getBean("selectCarBySeason");
//
//        assertFalse(car.hasHeadlightsTurnedOn());
//    }

//    @Test //tutaj to samo pytanko
//    public void shouldHaveLightsOn(){
//        Clock springClock = Clock.fixed(
//                LocalDateTime.of(2023, Month.APRIL, 15, 22, 0)
//                        .toInstant(ZoneId.systemDefault().getRules().getOffset(Instant.now())),
//                ZoneId.systemDefault()
//        );
//        CarFactory springCarFactory = new CarFactory();
//
//        Car car = springCarFactory.selectCarBySeason();
//
//        assertTrue(car.hasHeadlightsTurnedOn());
//    }

    // + pytanie: dlaczego jak dodałam CarFactory to zepsuły się testy do Calculatora, bo mają jakiś problem z CarFactory, ale CarFactory nie ma problemu z Calculatorem?
}
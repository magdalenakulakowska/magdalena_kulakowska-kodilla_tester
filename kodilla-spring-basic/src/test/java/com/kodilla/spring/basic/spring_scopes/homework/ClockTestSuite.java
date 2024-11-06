package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ClockTestSuite {

    @Test
    public void shouldReturnDifferentTimeForDifferentBeans() throws InterruptedException {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_scopes");

        Clock clock = context.getBean(Clock.class);
        Thread.sleep(1000);
        Clock clock1 = context.getBean(Clock.class);

        assertNotEquals(clock.getCurrentTime(), clock1.getCurrentTime());
    }

}
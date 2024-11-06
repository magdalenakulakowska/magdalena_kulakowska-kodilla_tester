package com.kodilla.spring.basic.spring_scopes;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TaskTestSuite {

    @Test
    public void shouldCreateDifferentTasks() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_scopes");
        Task firstBean = context.getBean(Task.class);
        Task secondBean = context.getBean(Task.class);
        Task thirdBean = context.getBean(Task.class);
        assertNotEquals(firstBean, secondBean);
        assertNotEquals(secondBean, thirdBean);
        assertNotEquals(firstBean, thirdBean);
    }
}
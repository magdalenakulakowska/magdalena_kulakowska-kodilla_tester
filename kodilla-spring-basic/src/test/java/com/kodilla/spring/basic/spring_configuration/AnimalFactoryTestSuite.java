package com.kodilla.spring.basic.spring_configuration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AnimalFactoryTestSuite {

    ApplicationContext context;

    @BeforeEach
    public void initialize() {
        context = new AnnotationConfigApplicationContext("com.kodilla.spring");
    }

    @Test
    public void shouldCreateDogAndFetchByBeanName() {
        Dog dog = (Dog) context.getBean("createDog");

        String voice = dog.getVoice();

        assertEquals("Bark bark", voice);
    }

    @Test
    public void shouldCreateRandomAnimal() {
        Animal animal = (Animal) context.getBean("randomAnimal");

        String voice = animal.getVoice();
        System.out.println(voice);

        List<String> possibleVoices = Arrays.asList("Bark bark", "Meow meow", "Quack quack");
        assertTrue(possibleVoices.contains(voice));
    }
}
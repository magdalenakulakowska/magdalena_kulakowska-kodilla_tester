package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ShippingCenterTestSuite {

    ApplicationContext context;
    ShippingCenter bean;

    @BeforeEach
    public void initialize(){
        context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        bean = context.getBean(ShippingCenter.class);
    }

    @Test
    public void shouldDeliverPackage() {
        String message = bean.sendPackage("Lincoln Street 1/2B, United States 12-123", 9.2);
        assertEquals(message, "Package delivered by Inpost to: Lincoln Street 1/2B, United States 12-123");
    }

    @Test
    public void shouldNotDeliverPackageAboveApprovedWeight() {
        String message = bean.sendPackage("Lincoln Street 1/2B, United States 12-123", 39.2);
        assertEquals(message, "Package not delivered by Inpost to: Lincoln Street 1/2B, United States 12-123");
    }

    @Test
    public void shouldNotDeliverPackageWithNoWeight() {
        String message = bean.sendPackage("Lincoln Street 1/2B, United States 12-123", 0.0);
        assertEquals(message, "Package not delivered by Inpost to: Lincoln Street 1/2B, United States 12-123");
    }

    @Test
    public void shouldNotDeliverPackageWithNegativeWeight() {
        String message = bean.sendPackage("Lincoln Street 1/2B, United States 12-123", -10.0);
        assertEquals(message, "Package not delivered by Inpost to: Lincoln Street 1/2B, United States 12-123");
    }
}
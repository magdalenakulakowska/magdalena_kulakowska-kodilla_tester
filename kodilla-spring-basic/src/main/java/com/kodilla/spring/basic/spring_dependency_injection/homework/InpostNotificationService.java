package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class InpostNotificationService implements NotificationService {

    @Override
    public String success(String address) {
        return "Package delivered by Inpost to: " + address;
    }

    @Override
    public String fail(String address) {
        return "Package not delivered by Inpost to: " + address;
    }
}

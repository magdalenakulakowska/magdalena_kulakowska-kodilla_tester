package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class DPDNotificationService implements NotificationService {

    @Override
    public String success(String address) {
        return "Package delivered by DPD to: " + address;
    }

    @Override
    public String fail(String address) {
        return "Package not delivered by DPD to: " + address;
    }
}

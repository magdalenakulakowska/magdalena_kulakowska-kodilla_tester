package com.kodilla.spring.basic.dependency_injection.homework;

public class DPDNotificationService implements NotificationService {

    @Override
    public void success(String address) {
        System.out.println("Package delivered by DPD to: " + address);
    }

    @Override
    public void fail(String address) {
        System.out.println("Package not delivered by DPD to: " + address);
    }
}

package com.kodilla.spring.basic.dependency_injection.homework;

public class DHLNotificationService implements NotificationService {

    @Override
    public void success(String address) {
        System.out.println("Package delivered by DHL to: " + address);
    }

    @Override
    public void fail(String address) {
        System.out.println("Package not delivered by DHL to: " + address);
    }
}

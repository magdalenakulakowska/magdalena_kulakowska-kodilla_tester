package com.kodilla.spring.basic.dependency_injection.homework;

public class DHLDeliveryService implements DeliveryService {

    @Override
    public boolean deliverPackage(String address, double weight) {
        if (weight > 30) {
            System.out.println("Package too heavy and can't be delivered by DHL to: " + address);
            return false;
        }
        System.out.println("Delivering by DHL to " + address + " in progress...");
        return true;
    }
}

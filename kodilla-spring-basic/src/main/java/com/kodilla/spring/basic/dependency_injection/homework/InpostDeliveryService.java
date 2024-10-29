package com.kodilla.spring.basic.dependency_injection.homework;

public class InpostDeliveryService implements DeliveryService {

    @Override
    public boolean deliverPackage(String address, double weight) {
        if (weight > 15) {
            System.out.println("Package too heavy and can't be delivered by Inpost to: " + address);
            return false;
        }
        System.out.println("Delivering by Inpost to " + address + " in progress...");
        return true;
    }
}

package com.kodilla.spring.basic.dependency_injection.homework;

public class DPDDeliveryService implements DeliveryService {

    @Override
    public boolean deliverPackage(String address, double weight) {
        if (weight > 25) {
            System.out.println("Package too heavy and can't be delivered by DPD to: " + address);
            return false;
        }
        System.out.println("Delivering by DPD to " + address + " in progress...");
        return true;
    }
}

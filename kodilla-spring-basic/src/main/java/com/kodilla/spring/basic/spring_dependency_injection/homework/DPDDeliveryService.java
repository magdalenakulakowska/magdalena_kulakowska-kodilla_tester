package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class DPDDeliveryService implements DeliveryService {

    @Override
    public boolean deliverPackage(String address, double weight) {
        if(weight > 25.0 || weight <= 0) {
            return false;
        }
        return true;
    }
}

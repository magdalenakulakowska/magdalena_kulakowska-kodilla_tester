package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class InpostDeliveryService implements DeliveryService {

    @Override
    public boolean deliverPackage(String address, double weight) {
        if(weight > 18.0 || weight <= 0) {
            return false;
        }
        return true;
    }
}

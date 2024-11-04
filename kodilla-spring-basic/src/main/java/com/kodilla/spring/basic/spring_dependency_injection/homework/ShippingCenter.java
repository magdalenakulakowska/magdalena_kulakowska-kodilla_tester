package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ShippingCenter {

    @Autowired
    @Qualifier(value = "inpostDeliveryService")
    DeliveryService deliveryService;

    @Autowired
    @Qualifier(value = "inpostNotificationService")
    NotificationService notificationService;


    public String sendPackage(String address, double weight) {
        if(deliveryService.deliverPackage(address,weight)){
            return notificationService.success(address);
        }
        return notificationService.fail(address);
    }
}

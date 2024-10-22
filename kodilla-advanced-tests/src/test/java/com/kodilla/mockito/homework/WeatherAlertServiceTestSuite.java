package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class WeatherAlertServiceTestSuite {

    WeatherAlertService weatherAlertService = new WeatherAlertService();
    Person person = Mockito.mock(Person.class);
    Person secondPerson = Mockito.mock(Person.class);
    Person thirdPerson = Mockito.mock(Person.class);
    Alert alert = Mockito.mock(Alert.class);
    Notification notification = Mockito.mock(Notification.class);

    @Test
    public void notSubscribedPersonShouldNotReceiveAlertAboutLocation(){
        weatherAlertService.sendAlertForLocation("London", alert);

        Mockito.verify(person, Mockito.never()).receiveAlert(alert);
    }

    @Test
    public void subscribedPersonShouldReceiveAlertAboutLocation(){
        weatherAlertService.addSubscriberToLocation("London", person);

        weatherAlertService.sendAlertForLocation("London", alert);

        Mockito.verify(person, Mockito.times(1)).receiveAlert(alert);
    }

    @Test
    public void subscribedPersonShouldReceiveAlertsAboutAllSubscribedLocations(){
        weatherAlertService.addSubscriberToLocation("London", person);
        weatherAlertService.addSubscriberToLocation("Paris", person);

        weatherAlertService.sendAlertForLocation("London", alert);
        weatherAlertService.sendAlertForLocation("Paris", alert);

        Mockito.verify(person, Mockito.times(2)).receiveAlert(alert);
    }

    @Test
    public void subscribedPersonCanBeSubscribedOnlyOnceToOneLocation(){
        weatherAlertService.addSubscriberToLocation("London", person);
        weatherAlertService.addSubscriberToLocation("London", person);

        weatherAlertService.sendAlertForLocation("London", alert);

        Mockito.verify(person, Mockito.times(1)).receiveAlert(alert);
    }

    @Test
    public void unsubscribedPersonShouldNotReceiveAlertAboutLocation(){
        weatherAlertService.addSubscriberToLocation("London", person);
        weatherAlertService.removeSubscriberFromLocation("London", person);

        weatherAlertService.sendAlertForLocation("London", alert);

        Mockito.verify(person, Mockito.never()).receiveAlert(alert);
    }

    @Test
    public void unsubscribedPersonFromAllLocationsShouldNotReceiveAlertsAboutAnyLocation(){
        weatherAlertService.addSubscriberToLocation("London", person);
        weatherAlertService.addSubscriberToLocation("Paris", person);
        weatherAlertService.removeSubscriberFromAllLocations(person);

        weatherAlertService.sendAlertForLocation("London", alert);
        weatherAlertService.sendAlertForLocation("Paris", alert);

        Mockito.verify(person, Mockito.never()).receiveAlert(alert);
    }

    @Test
    public void onlySubscribedGroupOfPeopleShouldReceiveAlertsAboutLocation(){
        weatherAlertService.addSubscriberToLocation("London", person);
        weatherAlertService.addSubscriberToLocation("London", secondPerson);

        weatherAlertService.sendAlertForLocation("London", alert);

        Mockito.verify(person, Mockito.times(1)).receiveAlert(alert);
        Mockito.verify(secondPerson, Mockito.times(1)).receiveAlert(alert);
        Mockito.verify(thirdPerson, Mockito.never()).receiveAlert(alert);
    }

    @Test
    public void allPeopleShouldReceiveNotification(){
        weatherAlertService.addSubscriberToLocation("London", person);
        weatherAlertService.addSubscriberToLocation("London", secondPerson);
        weatherAlertService.addSubscriberToLocation("Paris", thirdPerson);

        weatherAlertService.sendNotification(notification);

        Mockito.verify(person, Mockito.times(1)).receiveNotification(notification);
        Mockito.verify(secondPerson, Mockito.times(1)).receiveNotification(notification);
        Mockito.verify(thirdPerson, Mockito.times(1)).receiveNotification(notification);
    }

    @Test
    public void allPeopleShouldReceiveOnlyOneNotificationEvenWhenAssignedToMultipleLocations(){
        weatherAlertService.addSubscriberToLocation("London", person);
        weatherAlertService.addSubscriberToLocation("Paris", person);
        weatherAlertService.addSubscriberToLocation("London", secondPerson);
        weatherAlertService.addSubscriberToLocation("Paris", thirdPerson);

        weatherAlertService.sendNotification(notification);

        Mockito.verify(person, Mockito.times(1)).receiveNotification(notification);
        Mockito.verify(secondPerson, Mockito.times(1)).receiveNotification(notification);
        Mockito.verify(thirdPerson, Mockito.times(1)).receiveNotification(notification);
    }

    @Test
    public void subscribedPeopleShouldNotReceiveAlertAboutLocationThatWasRemoved(){
        weatherAlertService.addSubscriberToLocation("London", person);
        weatherAlertService.addSubscriberToLocation("Paris", person);
        weatherAlertService.addSubscriberToLocation("London", secondPerson);
        weatherAlertService.addSubscriberToLocation("Paris", thirdPerson);
        weatherAlertService.removeLocation("London");

        weatherAlertService.sendNotification(notification);

        Mockito.verify(person, Mockito.times(1)).receiveNotification(notification);
        Mockito.verify(secondPerson, Mockito.never()).receiveNotification(notification);
        Mockito.verify(thirdPerson, Mockito.times(1)).receiveNotification(notification);
    }
}
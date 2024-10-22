package com.kodilla.mockito.homework;

import java.util.*;

public class WeatherAlertService {

    private HashMap<String, Set<Person>> subscriptions = new HashMap<>();

    public void addSubscriberToLocation(String location, Person person) {
        Set<Person> subscribers = subscriptions.getOrDefault(location, new HashSet<>());

        subscribers.add(person);

        subscriptions.put(location, subscribers);
    }

    public void sendAlertForLocation(String location, Alert alert) {
        subscriptions.getOrDefault(location, new HashSet<>()).forEach(person -> person.receiveAlert(alert));
    }

    public void removeSubscriberFromLocation(String location, Person person) {
        Set<Person> subscribers = subscriptions.getOrDefault(location, new HashSet<>());

        subscribers.remove(person);

        subscriptions.put(location, subscribers);
    }

    public void removeSubscriberFromAllLocations(Person person) {
        for (Set<Person> persons : subscriptions.values()) {
            persons.remove(person);
        }
    }

    public void sendNotification(Notification notification) {
        Set<Person> uniquePersons = new HashSet<>();

        for (Set<Person> persons : subscriptions.values()) {
            uniquePersons.addAll(persons);
        }

        uniquePersons.forEach(person -> person.receiveNotification(notification));
    }

    public void removeLocation(String location) {
        subscriptions.remove(location);
    }
}

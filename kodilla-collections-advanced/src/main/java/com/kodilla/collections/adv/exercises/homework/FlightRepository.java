package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    public static List<Flight> getFlightsTable(){
        List<Flight> flightsList = new ArrayList<>();

        flightsList.add(new Flight("Gdańsk", "Crete"));
        flightsList.add(new Flight("Stockholm", "Gdańsk"));
        flightsList.add(new Flight("London", "Gdańsk"));
        flightsList.add(new Flight("Gdańsk", "Berlin"));
        flightsList.add(new Flight("Gdańsk", "Crete"));

        return flightsList;
    }
}

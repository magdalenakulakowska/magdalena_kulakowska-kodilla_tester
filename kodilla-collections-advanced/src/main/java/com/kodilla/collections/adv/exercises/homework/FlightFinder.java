package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

import static com.kodilla.collections.adv.exercises.homework.FlightRepository.getFlightsTable;

public class FlightFinder {
    public List<Flight> findFlightsFrom(String departure){
        List<Flight> result = new ArrayList<>();
        List<Flight> flights = getFlightsTable();

        for(Flight flight: flights) {
            if(flight.getDeparture().equals(departure)){
                result.add(flight);
            }
        }

        return result;
    }

    public List<Flight> findFlightsTo(String arrival){
        List<Flight> result = new ArrayList<>();
        List<Flight> flights = getFlightsTable();

        for(Flight flight: flights) {
            if(flight.getArrival().equals(arrival)){
                result.add(flight);
            }
        }

        return result;
    }
}

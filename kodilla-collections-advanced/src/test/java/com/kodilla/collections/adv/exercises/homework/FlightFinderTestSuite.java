package com.kodilla.collections.adv.exercises.homework;

import com.kodilla.collections.adv.exercises.dictionary.EnglishWord;
import com.kodilla.collections.adv.exercises.dictionary.PartOfSpeech;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static com.kodilla.collections.adv.exercises.homework.FlightRepository.getFlightsTable;
import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    @Test
    public void testFindFlightsFrom () {
        //given
        FlightFinder flightFinder = new FlightFinder();

        //when
        List<Flight> result = flightFinder.findFlightsFrom("Gdańsk");

        //then
        List<Flight> expectedList = new ArrayList<>();

        expectedList.add(new Flight("Gdańsk", "Crete"));
        expectedList.add(new Flight("Gdańsk", "Berlin"));
        expectedList.add(new Flight("Gdańsk", "Crete"));

        assertEquals(expectedList, result);
    }

    @Test
    public void testFindFlightsTo () {
        //given
        FlightFinder flightFinder = new FlightFinder();

        //when
        List<Flight> result = flightFinder.findFlightsTo("Crete");

        //then
        List<Flight> expectedList = new ArrayList<>();

        expectedList.add(new Flight("Gdańsk", "Crete"));
        expectedList.add(new Flight("Gdańsk", "Crete"));

        assertEquals(expectedList, result);
    }
}
package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {
    @Test
    public void TestFindFlightsFrom(){
        // given
        List<Flight> flights = new ArrayList<>();
        FlightFinder flightFinder = new FlightFinder();
        // when
        flights = flightFinder.findFlightsFrom("Gdańsk");
        // then
        List<Flight> testFlights = new ArrayList<>();
        testFlights.add(new Flight("Gdańsk", "Warszawa"));
        testFlights.add(new Flight("Gdańsk", "Barcelona"));
        assertEquals(testFlights,flights);
    }

    @Test
    public void TestFindFlightsTo() {
        // given
        List<Flight> flights = new ArrayList<>();
        FlightFinder flightFinder = new FlightFinder();
        // when
        flights = flightFinder.findFlightsTo("Barcelona");
        // then
        List<Flight> testFlights = new ArrayList<>();
        testFlights.add(new Flight("Gdańsk", "Barcelona"));
        testFlights.add(new Flight("Warszawa", "Barcelona"));
        assertEquals(testFlights, flights);
    }
}
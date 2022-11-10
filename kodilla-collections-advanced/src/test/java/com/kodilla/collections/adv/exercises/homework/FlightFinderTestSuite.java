package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {
    private List<Flight> flights;
    private FlightFinder flightFinder;

    @BeforeEach
    public void setUp(){
       flights = new ArrayList<>();
       flightFinder = new FlightFinder();
    }

    @Test
    public void TestFindFlightsFrom(){
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
        // when
        flights = flightFinder.findFlightsTo("Barcelona");
        // then
        List<Flight> testFlights = new ArrayList<>();
        testFlights.add(new Flight("Gdańsk", "Barcelona"));
        testFlights.add(new Flight("Warszawa", "Barcelona"));
        assertEquals(testFlights, flights);
    }
}
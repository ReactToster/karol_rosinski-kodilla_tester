package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    public static List<Flight> getFlightsTable() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Gdańsk", "Warszawa"));
        flights.add(new Flight("Gdańsk", "Barcelona"));
        flights.add(new Flight("Warszawa", "Barcelona"));
        flights.add(new Flight("Barcelona", "Berlin"));
        return flights;
    }
}

package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FlightFinder {
    public List<Flight> findFlightsFrom(String departure){
        List<Flight> result = new ArrayList<>();
        List<Flight> flights = FlightRepository.getFlightsTable();
        for (Flight flight :
                flights) {
            if (flight.getDeparture() == departure) {
                result.add(flight);
            }
        }
        return result;
    }

    public List<Flight> findFlightsTo(String arrival){
        List<Flight> result = new ArrayList<>();
        List<Flight> flights = FlightRepository.getFlightsTable();
        for (Flight flight :
                flights) {
            if (flight.getArrival() == arrival) {
                result.add(flight);
            }
        }
        return result;
    }
}

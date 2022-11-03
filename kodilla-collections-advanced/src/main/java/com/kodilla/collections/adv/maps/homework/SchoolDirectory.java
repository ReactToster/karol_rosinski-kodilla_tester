package com.kodilla.collections.adv.maps.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Director, School> schools = new HashMap<>();

        schools.put(new Director("Smith"), new School("Primary School", Arrays.asList(15, 18, 15, 20, 21)));
        schools.put(new Director("Newman"), new School("High School", Arrays.asList(20, 25, 23, 21, 21)));
        schools.put(new Director("Summers"), new School("Private School", Arrays.asList(15, 16, 15, 22, 28)));

        for (Map.Entry<Director, School> school :
                schools.entrySet()) {
            System.out.println("Director: " + school.getKey().getLastname() + ", " + school.getValue().toString());
        }
    }
}
